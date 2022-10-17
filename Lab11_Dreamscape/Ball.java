import java.awt.*;
public class Ball
{
    private int x, y, size;
    private Color color;
    private int opacity, r, g, b;
    
    public Ball()
    {
        size = 10;
        //generate random position and color for a Ball
        x = (int)(Math.random()*(1350-size));
        y = (int)(Math.random()*(800-size));
        r = (int)(Math.random()*256);
        g = (int)(Math.random()*256);
        b = (int)(Math.random()*256);
        opacity = 250;
        color = new Color( r, g, b, opacity );
    }
    public void grow()
    {
        //increase the size
        size += 2;
        //shift the posiiton so the center of the ball remains in the same place
        x -= 1;
        y -= 1;
        //increase transparecny
        opacity -= 1;
        //update the transparency of the Ball
        color = new Color( r, g, b, opacity );
    }
    
    public int getOpacity()
    {
        return opacity;
    }
    
    
    public void draw( Graphics page )
    {
        page.setColor( color );
        page.fillOval( x, y, size, size );
    }
}