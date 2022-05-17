import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dinoSkin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dinoSkin extends Actor
{
    /**
     * Act - do whatever the dinoSkin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this) == true) 
        {
            Char b = new Char();
            b.image = 2;
            Greenfoot.delay(10);
            game a = new game();
            Greenfoot.setWorld(a);
        }
    }    
}
