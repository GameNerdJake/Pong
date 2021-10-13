import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    private int dX = 6;
    private int dY = 6;
    private int points1 = 0;
    private int points2 = 0;
    private int startDelay = 0;
    
   
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        startDelay++;
        move();
        checkForBounce();
        checkForPoints();
        hitPaddle();
        checkForWin();
    }
    
    /**
     * Makes the ball move.
     */
    public void move ()
    {
        if (startDelay >= 60)
        {
        setLocation(getX() + dX, getY() + dY);
        }
    }
    
    /**
     * Checks if the ball bounces and makes a sound if it does
     */
    public void checkForBounce()
    {
        if (getY() <= 0|| getY() >= getWorld().getHeight() -1)
        {
            dY = -dY;   
            Greenfoot.playSound("augh.mp3");
        }
    }
    
    /**
     * Checks if points should be given
     * Also delays the ball upon startup/points
     */
    public void checkForPoints()
    {
        if (getX() == 599|| getX() >= getWorld().getWidth()-1)
        {
            setLocation(300,200);
            points1+=1;
            checkForWin();
            Counter counter = (Counter)getWorld().getObjects(Counter.class).get(0);
            counter.add(1);
            startDelay = 0;
            dX = -dX;
        }
        if (getX() <= 0|| getX() >= getWorld().getWidth())
        {
            setLocation(300,200);
            points2+=1;
            checkForWin();
            Counter2 counter2 = (Counter2)getWorld().getObjects(Counter2.class).get(0);
            counter2.add(1);
            startDelay = 0;
            dX = -dX;
        }
    }
    
    /**
     * Makes the ball bounce off of a paddle
     */
    public void hitPaddle()
    {
        if (isTouching (paddle.class)){
            dY = -dY;
            dX = -dX;
            Greenfoot.playSound("augh.mp3");
        }
    }

    /**
     * Checks if player one or two wins
     */
    public void checkForWin()
    {
        if(points1 == 8)
        {
            Greenfoot.stop();
            Greenfoot.playSound("win.mp3");
            setImage("p1Winner.png");
        }
        if(points2 == 8)
        {
            Greenfoot.stop();
            Greenfoot.playSound("win.mp3");
            setImage("p2Winner.png");
        }
    }
    
}
