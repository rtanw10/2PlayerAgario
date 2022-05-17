import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player2 extends Actor
{
    /**
     * Act - do whatever the player2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this) == true) {
            player2Skin a = new player2Skin();
            Greenfoot.setWorld(a);
        }
    }    
}
