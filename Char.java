import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Char here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Char extends Actor
{
    /**
     * Act - do whatever the Char wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int mass = 20;
    public int score = 0;
    public static int image = Greenfoot.getRandomNumber(5);
    public GreenfootImage i = new GreenfootImage("smile.png");
    private int sizer = 4;
    public int pellets = 0;
    int mass2 = Char2.mass2;
    public static int mass1 = 20;
    
    public Char()
    {
        i = getImage();
        pellets = 0;
        score = 0;
        mass1 = 20;
        sizer = 4;
    }
    
    
    public void act() 
    {
        if(image == 0)
        {
            setImage("tiger.png");
        }
        if(image == 1)
        {
            setImage("hole.png");
        }
        if(image == 2)
        {
            setImage("dino.png");
        }
        if(image == 3)
        {
            setImage("potion.png");
        }
        if(image == 4)
        {
            setImage("girl.png");
        }
        if(image == 5)
        {
            setImage("girl.png");
        }
        i = getImage();
        controls();
        touchPellet();
        mass();
        mass2();
        touchChar2();
    }
    public void controls()
    {
        if (Greenfoot.isKeyDown("left"))
      {
          Greenfoot.setSpeed(50);
          move(-10);
      }
      
      else if (Greenfoot.isKeyDown("right"))
      {
        Greenfoot.setSpeed(50);
        move(10);
      }
      
      else if (Greenfoot.isKeyDown("up"))
      {
       turn(-90);
       Greenfoot.setSpeed(50);
       move(10);
       turn(90);
       
      }
      else if(Greenfoot.isKeyDown("down"))
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
            score = score + 1;
            mass1 = mass1 + 1;
            removeTouching(Pellets.class);
            pellets = pellets + 1;
        for (int i = 0; i < 1; i++)
        {
            getWorld().addObject(new Pellets(), Greenfoot.getRandomNumber(990), Greenfoot.getRandomNumber(690));
        }
        }
    }
    public void mass()
    {
             
             if(pellets >= 10)
             {
               i.scale(i.getWidth()*(1+(sizer))/4, i.getHeight()*(1+sizer)/4);
               setImage(i);
               //Greenfoot.setSpeed(65);
             }
    }
    public void mass2()
    {
             
             if(pellets >= 70)
             {
               i.scale(i.getWidth()*(1+(sizer))/4, i.getHeight()*(1+sizer)/4);
               setImage(i);
               //Greenfoot.setSpeed(30);
               //sizer++;
             }
    }
    public void touchChar2()
    {
        if(isTouching(Char2.class))
        {
           if((mass1 > mass2) == true)
           {
               removeTouching(Char2.class);
               mass1 = mass1 + mass2;
               i.scale(i.getWidth()*(1+(sizer))/4, i.getHeight()*(1+sizer)/4);
               setImage(i);
               Player2Lose a = new Player2Lose();
               Greenfoot.delay(100);
               Greenfoot.setWorld(a);
           } 
        }
    }
    public void touchStart()
    {
        if (Greenfoot.mouseClicked(Start.class) == true) {
            pellets = 0;
            game a = new game();
            Greenfoot.setWorld(a);
        }

    }
}
