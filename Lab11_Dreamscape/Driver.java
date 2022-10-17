import javax.swing.*;
public class Driver
{
    public static void main()
    {
        //classic graphics commands to create a frame and somethign in it
        JFrame frame = new JFrame( "DreamScape" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setLocation( 50, 50 );
        Sheet s = new Sheet();
        frame.getContentPane().add( s );
        frame.pack();
        frame.setVisible( true );
        s.execute();
    }
}

