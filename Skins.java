import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Skins here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skins extends Actor
{
    /**
     * Act - do whatever the Skins wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this) == true) {
            ask a = new ask();
            Greenfoot.setWorld(a);
        }
    }    
}
