
/**
 * Write a description of class MondrianFrame here.
 * 
 * @author Brendan
 * @version 16 Jan 2011
 */

import java.awt.*;
import javax.swing.*;

public class MondrianFrame extends JFrame
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class MondrianFrame
     */
    public MondrianFrame()
    {
        // initialise instance variables
        super("Mondrian Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(new MondrianPanel());
        pack();
        setVisible(true); // Show the JFrame.
    }

}
