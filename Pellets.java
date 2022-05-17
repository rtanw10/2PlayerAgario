import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pellets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pellets extends Actor
{
    /**
     * Act - do whatever the Pellets wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int random = Greenfoot.getRandomNumber(6);
   
    public void act() 
    {
        color();
    }    
    public void color()
    {
        if(random == 1)
        {
            setImage("blue.png");
        }
        if(random == 2)
        {
            setImage("yellow.png");
        }
        if(random == 3)
        {
            setImage("orange.png");
        }
        if(random == 4)
        {
            setImage("pink.png");
        }
        if(random == 5)
        {
            setImage("green.png");
        }
    }
}
