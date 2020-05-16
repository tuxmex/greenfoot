import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    private GreenfootImage robotimage1;
    private GreenfootImage robotimage2;
    private GreenfootImage gameoverimage;
    private int nLives;
    private int score;
    private int pizzaEaten;
    private int totalPizzas = 7;
    
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Robot(){
      robotimage1 = new GreenfootImage("man01.png");
      robotimage2 = new GreenfootImage("man02.png");
      gameoverimage = new GreenfootImage("gameover.png");
      nLives = 3;
      score = 0;
      pizzaEaten = 0;
    }
    public void act() 
    {
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        detectPizzaCollision();
        detectHomeCollision();
        
        
    }
    
    
    public void robotMovement(){
        if(Greenfoot.isKeyDown("left")){
           setLocation(getX()-3, getY());
           animate();
        }
        if(Greenfoot.isKeyDown("right")){
           setLocation(getX()+3, getY());
           animate();
        }
        if(Greenfoot.isKeyDown("up")){
           setLocation(getX(), getY()-3);
           animate();
        }
        if(Greenfoot.isKeyDown("down")){
           setLocation(getX(), getY()+3);
           animate();
        }
    }
    
    public void detectWallCollision(){
       if(isTouching(Wall.class)){
           setLocation(48, 50);
           Greenfoot.playSound("hurt1.wav");
           removeLife();
        }
       
    }
        
    public void detectBlockCollision(){
        if(isTouching(Block.class)){
            setLocation(48, 50);
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
    }
    
    public void detectPizzaCollision(){
        if(isTouching(Pizza.class)){
            removeTouching(Pizza.class);
            Greenfoot.playSound("mmm.wav");
            pizzaEaten++;
        }
    }
    
    public void detectHomeCollision(){
         if(isTouching(Home.class) && pizzaEaten==totalPizzas){
            setLocation(48,50);
            Greenfoot.playSound("llegue.wav");
            increaseScore();
        }
    }
    
    public void animate(){
       if(getImage().equals(robotimage2)){
          setImage(robotimage1); 
        } else{
          setImage(robotimage2);
        }
    }
    
    public void removeLife(){
      nLives--;
      showStatus();
      testEndGame();
    }
    
    public void testEndGame(){
        if(nLives <= 0){
           setImage(gameoverimage);
           Greenfoot.stop();
        }
    }
    
    public void showStatus(){
       getWorld().showText("Lives: "+ nLives, 90, 520);
       getWorld().showText("Score: "+ score, 90, 540);
    }
    
    public void increaseScore(){
        score++;
        showStatus();
    }
    
    public void collisionDetected(){
        
    }
}
