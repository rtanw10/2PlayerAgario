import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ask here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ask extends World
{

    /**
     * Constructor for objects of class ask.
     * 
     */
    public ask()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        addObject(new player1(), 328, 413);
        addObject(new player2(), 691, 413);
        addObject(new back(), 52, 60);
    }
}
