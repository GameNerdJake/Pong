import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ball ball = new Ball();
        addObject(ball, getWidth()/2, getHeight()/2);
        
        paddle paddle = new paddle("up", "down");
        addObject(paddle,582,190);
        
        paddle paddle2 = new paddle("w", "s");
        addObject(paddle2,17,190);
        
        Counter Counter = new Counter();
        addObject(Counter,50,40);
        
        Counter2 Counter2 = new Counter2();
        addObject(Counter2,550,40);
    }
    
}
