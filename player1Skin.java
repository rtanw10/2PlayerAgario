import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player1Skin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player1Skin extends World
{

    /**
     * Constructor for objects of class player1Skin.
     * 
     */
    public player1Skin()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        addObject(new weirdSkin(), 217, 271);
        addObject(new dinoSkin(), 860, 273);
        addObject(new potionSkin(), 349, 533);
        addObject(new holeSkin(), 710, 535);
        addObject(new tigerSkin(), 521, 271);
        addObject(new back(), 52, 60);
        //addObject(new next(), 880, 650);
    }
}
