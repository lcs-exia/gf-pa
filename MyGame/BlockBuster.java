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
        score = 0;
        
    }
}
