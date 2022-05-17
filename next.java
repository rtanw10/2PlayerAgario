import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class next here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class next extends Actor
{
    /**
     * Act - do whatever the next wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this) == true) 
        {
            player1Skin2 a = new player1Skin2();
            Greenfoot.setWorld(a);
        }
    }    
}
