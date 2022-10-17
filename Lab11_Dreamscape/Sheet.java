import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class Sheet extends JPanel
{
    //declare an ArrayList that can hold Ball objects
    private ArrayList<Ball> balls;
    public Sheet()
    {
        //initialize the ArrayList; it is currently empty
        balls = new ArrayList<Ball>();
        //set the background and size of the panel
        this.setBackground( new Color( 177, 156, 217 ) );
        this.setPreferredSize( new Dimension( 1350, 800 ) );
    }
    public void execute()
    {
        //make a variable to keep track of the time
        int timer = 0;
        //create an infinite loop
        while( true )
        {
            //command each Ball object to grow
            for( int i = 0; i < balls.size(); i++ )
            {
                balls.get(i).grow();
                //check to see if a Ball is transparent
                if( balls.get(i).getOpacity() <= 0 )
                {
                    //if transparent, remove the ball from the ArrayList
                    balls.remove(i);
                    i--;
                }
            }
            this.repaint();
            try
            {
                Thread.sleep(10);
                timer += 10;
            }catch( InterruptedException ex ){}
            //create a new Ball object every 0.8 seconds (800 milliseconds)
            if( timer % 800 == 0 )
            {
                //add the new Ball to the ArrayList
                balls.add( new Ball() );
            }
        }
    }
    public void paintComponent( Graphics page )
    {
        super.paintComponent( page );
        for( int i = 0; i < balls.size(); i++ )
        {
            balls.get(i).draw( page );
        }
    }
}