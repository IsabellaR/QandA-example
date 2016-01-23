import greenfoot.*;
import java.awt.Font;
import java.awt.Color;
/**
 * Write a description of class Blackboard here.
 * 
 * @author (Mr. Kaehms) 
 * @version (Rev 0.0 alpha)
 * 
 */
public class Blackboard extends World
{

    /**
     * Constructor for objects of class Blackboard.
     * 
     */
    public Blackboard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 467, 1); 

       prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Question question = new Question("1) A methodology of writing software that supports inheritance and encapsulation ", "A) Inheritance", "B) Algorithm", "C) Object Oriented Programming", "D)Java", 2);
        addObject(question, 382, 146);
      
    }
}
