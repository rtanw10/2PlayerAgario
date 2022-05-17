import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class potionSkin2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class potionSkin2 extends Actor
{
    /**
     * Act - do whatever the potionSkin2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this) == true) 
        {
            Char2 b = new Char2();
            b.image2 = 3;
            Greenfoot.delay(10);
            game a = new game();
            Greenfoot.setWorld(a);
        }
    }    
}
