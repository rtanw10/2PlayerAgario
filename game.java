import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class game extends World
{

    /**
     * Constructor for objects of class game.
     * 
     */
    public game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        
        for (int i = 0; i < 50; i++)
        {
            addObject(new Pellets(), Greenfoot.getRandomNumber(990), Greenfoot.getRandomNumber(690));
        }
        
        addObject(new Char(), 633, 452);
        addObject(new Char2(), 956, 137);
        
    }
}
