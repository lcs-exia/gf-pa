import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends Actor
{
    /**
     * Act - do whatever the Block wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean areThereBlocks;
    
    public void act() 
    {
        // Add your action code here.
        // if (isRemoved)
        // {
            // areThereBlocks = true;
        // }
    }    
    public void endGame()
    {
        if (areThereBlocks = true)
        {
            Greenfoot.stop();
        }
    }
    
}
