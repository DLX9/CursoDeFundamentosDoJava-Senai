import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Hollow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hollow extends Actor
{
    int time = 5;
    int numImage = 1;
    private boolean pulo;
    GreenfootImage myImage;
    /**
     * Act - do whatever the Hollow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    pulo = false;
    if(Greenfoot.isKeyDown("d")){
        move(3);
        time--;
        if(time == 0){
            time = 5;
          myImage = new GreenfootImage("andando" + numImage + ".png");
          setImage(myImage);
          numImage++;
          if(numImage > 7){
                numImage = 1;
            }
        }
    }
    if(Greenfoot.isKeyDown("a")){
        move(-3);
        time--;
        if(time == 0){
            time = 5;
          myImage = new GreenfootImage("andando" + numImage + ".png");
          setImage(myImage);
          numImage++;
          getImage().mirrorHorizontally();
          if(numImage > 7){
                numImage = 1;
            }
        }
    }
    }
    
}
