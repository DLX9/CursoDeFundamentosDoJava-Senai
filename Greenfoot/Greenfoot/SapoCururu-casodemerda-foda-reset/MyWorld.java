import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class MyWorld extends World
{
    public MyWorld()
    {    
        // Cria um novo senário.
        super(900, 800, 1);
        
        //Adiciona o foguete
        addObject (new foguete(), 100, 100);
        //Gera as bolinhas de pontos
        gerarBolinhas();
        //Gera o alien
        gerarAlien();
        prepare();
    }
    public int timer = 1;
    public int i = 0;
    public void gerarBolinhas(){
        if(timer == 0){
        timer = timer + 5;
        i = 0;
        }else{
            while(i < 10){
                int x = Greenfoot.getRandomNumber(700) + 1;
                int y = Greenfoot.getRandomNumber(800) + 1;
                addObject (new bolinha(), x, y);
                i = i + 1;
            }
            i = 0;
            timer = timer - 5;
        }
    }
    public void gerarAlien(){
        int x = Greenfoot.getRandomNumber(700) + 1;
        int y = Greenfoot.getRandomNumber(800) + 1;
        addObject (new alien(), x, y);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
