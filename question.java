import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class question here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class question extends Actor
{
    /**
     * Act - do whatever the question wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this) == true) {
            instruction a = new instruction();
            Greenfoot.setWorld(a);
        }
    }    
}
