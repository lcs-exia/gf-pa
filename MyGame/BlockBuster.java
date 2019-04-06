import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlockBuster here.
 * 
 * @author (Eric Xia) 
 * @version (a version number or a date)
 */
public class BlockBuster extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private int score;
    public BlockBuster()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        blackBackground();
        showScore();
        Platform platform = new Platform();
        addObject(platform, 300, 580);
        score = 0;
        
        prepare();
        
    }

    private void blackBackground()
    {
        GreenfootImage background = new GreenfootImage(600, 600);

        background.setColor(Color.BLACK);
        background.fill();

        setBackground(background);
    }
    private void showScore()
    {
        showText("Score: "+ score, 100, 50);
        
    }

    private void addScore(int points)
    {
        score = score + points;
        showScore();
        
        // if (isTouching(Block.class))
        //{
        //}
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void prepare()
    {
        Ball ball = new Ball();
        addObject(ball,400,412);
        
        Block block = new Block();
        addObject(block,294,114);
        Block block2 = new Block();
        addObject(block2,228,161);
        Block block3 = new Block();
        addObject(block3,366,162);
        Block block4 = new Block();
        addObject(block4,163,210);
        Block block5 = new Block();
        addObject(block5,299,212);
        Block block6 = new Block();
        addObject(block6,437,213);
        Block block7 = new Block();
        addObject(block7,82,262);
        Block block8 = new Block();
        addObject(block8,220,263);
        Block block9 = new Block();
        addObject(block9,358,262);
        Block block10 = new Block();
        addObject(block10,497,264);
        
    }
}
