import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Char here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Char2 extends Actor
{
    /**
     * Act - do whatever the Char wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int mass2 = 20;
    public int score2 = 0;
    public static int image2 = Greenfoot.getRandomNumber(5);
    private int sizer2 = 4;
    public int pellets2 = 0;
    int mass = Char.mass1;
    public GreenfootImage i = new GreenfootImage("dino.png");
    
    public Char2()
    {
        i = getImage();
        score2 = 0;
        pellets2 = 0;
        mass2 = 20;
    }
    public void act() 
    {
        if(image2 == 0)
        {
            setImage("tiger.png");
        }
        if(image2 == 1)
        {
            setImage("hole.png");
        }
        if(image2 == 2)
        {
            setImage("dino.png");
        }
        if(image2 == 3)
        {
            setImage("potion.png");
        }
        if(image2 == 4)
        {
            setImage("girl.png");
        }
        i = getImage();
        controls();
        touchPellet();
        touchChar();
        
    }
    public void controls()
    {
        if (Greenfoot.isKeyDown("a"))
      {
          Greenfoot.setSpeed(50);
          move(-10);
       
      }
      
      else if (Greenfoot.isKeyDown("d"))
      {
          Greenfoot.setSpeed(50);
          move(10);
       
      }
      
      else if (Greenfoot.isKeyDown("w"))
      {
       turn(-90);
       Greenfoot.setSpeed(50);
       move(10);
       turn(90);
       
      }
      else if(Greenfoot.isKeyDown("s"))
      {
        turn(-90);
        Greenfoot.setSpeed(50);
        move(-10);
        turn(90);
      }
    }
    public void touchPellet()
    {
        if(isTouching(Pellets.class))
        {
            score2 = score2 + 1;
            mass2 = mass2 + 1;
            removeTouching(Pellets.class);
            pellets2 = pellets2 + 1;
            mass();
            mass2();
        for (int i = 0; i < 1; i++)
        {
            getWorld().addObject(new Pellets(), Greenfoot.getRandomNumber(990), Greenfoot.getRandomNumber(690));
        }
        }
    }
    public void mass()
    {
             
             if(pellets2 == 60)
             {
               i.scale(i.getWidth()*(1+(sizer2))/4, i.getHeight()*(1+sizer2)/4);
               setImage(i);
               Greenfoot.setSpeed(30);
             }
    }
    public void mass2()
    {
             
             if(pellets2 == 150)
             {
               i.scale(i.getWidth()*(1+(sizer2))/4, i.getHeight()*(1+sizer2)/4);
               setImage(i);
               //sizer++;
             }
    }
    public void touchChar()
    {
        if(isTouching(Char.class))
        {
           if((mass2 > mass) == true)
           {
               removeTouching(Char.class);
               mass2 = mass2 + mass;
               i.scale(i.getWidth()*(1+(sizer2))/4, i.getHeight()*(1+sizer2)/4);
               setImage(i);
               Player1Lose b = new Player1Lose();
               Greenfoot.delay(100);
               Greenfoot.setWorld(b);
           } 
        }
    }
        public void touchStart()
    {
        if (Greenfoot.mouseClicked(Start.class) == true) {
            game a = new game();
            Greenfoot.setWorld(a);
            mass2 = 20;
            sizer2 = 4;
        }
    }
}
    
