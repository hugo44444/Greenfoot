import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * My world is a new planet where fruits fall from the sky.
 * An explorer arrives there and some animals live on it.
 * 
 * @author Hugo Valera
 * @version alfa 1
 */
public class FruitPlanet extends World
{

    /**
     * Constructor for objects of class FruitPlanet.
     * 
     */
    public FruitPlanet()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(new Explorer(), 300, 200);
        addObject(new Turtle(), 100, 300);

        // Fila de ranas: todas a la misma distancia
        int numero = 5;                              
        int distancia = getWidth() / (numero + 1);   
        for (int i = 1; i <= numero; i++) {
            addObject(new Frog(), i * distancia, 100);
        }
    }
}
