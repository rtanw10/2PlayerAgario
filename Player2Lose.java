import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player2Lose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2Lose extends World
{

    /**
     * Constructor for objects of class Player2Lose.
     * 
     */
    public Player2Lose()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        addObject(new Start(), 523, 415);
        addObject(new back(), 52, 60);
    }
}
