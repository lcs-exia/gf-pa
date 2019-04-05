import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
  /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        // Add your action code here.
        bounce();
        removeBlock();
        moveBall();
    }    
    public void removeBlock()
    {
        if(isTouching(Block.class) )
        {
            removeTouching(Block.class);
        }
    }
    private int x;
    private int y;
  
    public void bounce()
    {
        if ( isAtEdge() )
        {
           /*  y = getY();
            if (y > 150)
            {   
                if (y < 300)
                {
                    x = getRotation();
                turn(x+180);
                }
                
            }
            if (y < 300)
            {
                x = getRotation();
                turn(180-x);
            }*/
            y = getY();
            if (y > 550)
            {
                Greenfoot.stop();
            }
            if (y > 150)
            {
                    x = getRotation();
                    turn(x+180);
            }
            if (y < 300)
            {
                x = getRotation();
                turn(180-x);
            }
            
        }
        if(isTouching(Platform.class) )
        {
            y = getY();
            if (y > 150)
            {
                    x = getRotation();
                    turn(x+180); 
            }
            if (y < 300)
            {
                x = getRotation();
                turn(180-x);
            }
        }
        if(isTouching(Block.class) )
        {
            y = getY();
            if (y > 150)
            {
                    x = getRotation();
                    turn(x+180); 
            }
            if (y < 300)
            {
                x = getRotation();
                turn(180-x);
            }
            
        }
        if (Greenfoot.isKeyDown("Space"))
        {
            setRotation(45);
        }

    }
    public void moveBall()
    {
      move(3);
    }
}
