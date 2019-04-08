import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    private int x;
    private int y;
    private int gameEnd;
    /**
     * Constructor
     * 
     * This runs once when the object is first created
     */
    Ball ()
    {
        setRotation(135);
        gameEnd = 0;
    }

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
            ((BlockBuster)getWorld()).addScore(100);
            gameEnd = gameEnd + 1;
            if (gameEnd == 10)
            {
                Greenfoot.stop();
            }
        }
    }

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
            int direction = getRotation();
            x = getX();
            y = getY();
            if (y > 575)
            {
                Greenfoot.stop();
            }
            if (x > 400)
            {
                if (direction < 90)
                {
                    setRotation(direction - 270);
                }
                else if (direction > 90)
                {
                    setRotation(direction + 270);
                }
            }
            
            
            if (direction < 45)
            { 
                setRotation(direction - 90);
            }
            if (direction > 135)
            {
                setRotation(direction + 90);
            }
            if (x < 300)
            {
                if (direction < 90)
                {
                    setRotation(direction + 90);
                }
                else if (direction > 90)
                {
                    setRotation(direction - 90);
                }
            } else if (x > 301)
            {
                if (direction < 90)
                {
                    setRotation(direction + 90);
                }
                else if (direction > 90)
                {
                    setRotation(direction - 90);
                }
            }
            if (x < 100)
            {
                if (y < 50)
                {
                        
                        setRotation(135);
                    
                }
            }

            
            
            // if (x > 550)
            // {
                // if (y > 400)
                // {
                    // setRotation(215);
                // }
            // }
         }

        //Bounce if touching platform
        if (isTouching(Platform.class))
        {
            int direction = getRotation();

            //When coming from the left, subtract
            if (direction <= 45)
            {
                setRotation(direction-90);
            }
            else if (direction == 135)
            {
                setRotation(direction+90);
            }

        }

        // if(isTouching(Platform.class) )
        // {
        // y = getY();
        // if (y > 150)
        // {
        // x = getRotation();
        // turn(x+180); 
        // }
        // if (y < 500)
        // {
        // x = getRotation();
        // turn(x-180);
        // }
        // }
        if(isTouching(Block.class) )
        {
            int direction = getRotation();

            //When coming from the left, subtract
            if (direction <= 45)
            {
                setRotation(direction-90);
            }
            else if (direction >= 135)
            {
                setRotation(direction+90);
            }
        }
    }

    public void addPoints()
    {
        if (isTouching(Block.class))
        {
            BlockBuster world = (BlockBuster)getWorld();

        }
    }

    public void moveBall()
    {
        move(3);
    }
}
