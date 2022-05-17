import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player2Skin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player2Skin extends World
{

    /**
     * Constructor for objects of class player2Skin.
     * 
     */
    public player2Skin()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        addObject(new weirdSkin2(), 217, 271);
        addObject(new dinoSkin2(), 860, 273);
        addObject(new potionSkin2(), 349, 533);
        addObject(new holeSkin2(), 710, 535);
        addObject(new tigerSkin2(), 521, 271);
        addObject(new back(), 52, 60);
        //addObject(new next(), 880, 650);
    }
}
