import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1Lose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1Lose extends World
{

    /**
     * Constructor for objects of class Player1Lose.
     * 
     */
    public Player1Lose()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        addObject(new Start(), 550, 395);
        addObject(new back(), 52, 60);
    }
}
