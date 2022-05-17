import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class holeSkin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class holeSkin extends Actor
{
    /**
     * Act - do whatever the holeSkin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int image = Greenfoot.getRandomNumber(5);

    public void act() 
    {
        if (Greenfoot.mouseClicked(this) == true) 
        {
            Char b = new Char();
            b.image = 1;
            Greenfoot.delay(10);
            game a = new game();
            Greenfoot.setWorld(a);
        }
    }    
}
