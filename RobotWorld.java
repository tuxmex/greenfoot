import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotWorld here.
 * 
 * @author (ARG) 
 * @version (1.0.0)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class RobotWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Block block = new Block(10);
        addObject(block,372,150);
        Wall wall = new Wall();
        addObject(wall,52,167);
        Wall wall2 = new Wall();
        addObject(wall2,160,167);
        Wall wall3 = new Wall();
        addObject(wall3,550,167);
        Wall wall4 = new Wall();
        addObject(wall4,650,167);
        Wall wall5 = new Wall();
        addObject(wall5,750,167);
        block.setLocation(306,171);
        Robot robot = new Robot();
        addObject(robot,48,51);
        Pizza pizza = new Pizza();
        addObject(pizza,550,60);
        Pizza pizza2 = new Pizza();
        addObject(pizza2,727,53);
        Pizza pizza3 = new Pizza();
        addObject(pizza3,364,303);
        Pizza pizza4 = new Pizza();
        addObject(pizza4,224,400);
        Pizza pizza5 = new Pizza();
        addObject(pizza5,622,395);
        ScorePanel scorePanel = new ScorePanel();
        addObject(scorePanel,106,525);
        Home home = new Home();
        addObject(home,717,521);

        block.setLocation(344,173);
        pizza3.setLocation(394,297);
        Pizza pizza6 = new Pizza();
        addObject(pizza6,711,265);
        Pizza pizza7 = new Pizza();
        addObject(pizza7,68,276);

    }
}
