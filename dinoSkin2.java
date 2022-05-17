import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dinoSkin2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dinoSkin2 extends Actor
{
    /**
     * Act - do whatever the dinoSkin2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this) == true) 
        {
            Char2 b = new Char2();
            b.image2 = 2;
            Greenfoot.delay(10);
            game a = new game();
            Greenfoot.setWorld(a);
        }
    }    
}
