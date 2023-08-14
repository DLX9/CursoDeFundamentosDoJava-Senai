import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class alien extends entidades
{
    /**
     * Act - do whatever the alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    if(isTouching(bolinha.class)){
            removeTouching(bolinha.class);
    }
    voar();
    }
    public void voar(){
    if(isAtEdge()){
        //Gera um número aleatório nos cantos do cenário
        turn(Greenfoot.getRandomNumber(90)-45);
    }
    move(Greenfoot.getRandomNumber(6) + 1);
    }

}
