
/**
 * Write a description of class MondrianFrame here.
 * 
 * @author Brenan (later edited by Jared Kamp)
 * @version 1/13/14 
 */

import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class MondrianPanel extends JPanel
{
    // instance variables - replace the example below with your own
    private int size = 600;
    private Random rand;
    /**
     * Constructor for objects of class MondrianFrame
     */
    public MondrianPanel()
    {
        rand = new Random();
        setPreferredSize(new Dimension(size, size));
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        for(int i = 0; i < (100 + rand.nextInt(1000)); i++)
        {
            g.setColor(Color.BLACK);
            int boarderW = rand.nextInt(200);
            int boarderH = rand.nextInt(100);
            int x = rand.nextInt(getWidth());
            int y = rand.nextInt(getHeight());
            g.fillRect((x+1), (y+1), (boarderW + 10), (boarderH + 10));
            switch(rand.nextInt(5))
            {
                case 0: g.setColor(Color.GREEN); break;
                case 1: g.setColor(Color.RED); break;
                case 2: g.setColor(Color.BLUE);break;
                case 3: g.setColor(Color.YELLOW);break;
                default: g.setColor(Color.WHITE); 
            }
            g.fillRect(x, y, boarderW, boarderH);            
        }
    }

}
