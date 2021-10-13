import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class paddle1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class paddle extends Actor
{
    private String up;
    private String down;
    
    /**
     * Act - do whatever the paddle1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeys();
        setRotation​(90);
        }
    
    public paddle(String up, String down)
    {
        this.up = up;
        this.down = down;
    }
    /**
     * Makes the paddle move
     */
    public void checkKeys()
    { 
        if(Greenfoot.isKeyDown(up))
        {
            move(-6);
        }
        
        if(Greenfoot.isKeyDown(down))
        {
            move(6);
        }
   }   
   
   
}
