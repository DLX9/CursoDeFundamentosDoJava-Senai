import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class foguete here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class foguete extends entidades
{
    /**
     * Act - do whatever the foguete wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Faz o objeto se mover
        move(3);
        
        perderVidas();
        comerBolinhas();
        ganhar();
        //Gira ao clicar no d
        if(Greenfoot.isKeyDown("d")){
            turn(5);
        }
        if(Greenfoot.isKeyDown("shift")){
            move(10);
        }
        //Gira ao clicar no a
        if(Greenfoot.isKeyDown("a")){
            turn(-5);
        }
    }
    public int vidas = 2;
    public void perderVidas(){
        if(isTouching(alien.class)){
            if(vidas <= 0){
                Greenfoot.stop();
                getWorld().showText("Perdeu troxa", 450, 400);
            }else{
                vidas = vidas - 1;
                move(200);
            }
        }
    }
    public int pontos = 0;
    public void comerBolinhas(){
        if(isTouching(bolinha.class)){
            int i = 0;
            removeTouching(bolinha.class);
            i = i - 1;
            pontos = pontos + 1;
        }
    }
    public void ganhar(){
        if(pontos == 10){
            Greenfoot.stop();
            getWorld().showText("Você ganhou!!", 450, 400);
        }
    }
    }

