import java.awt.*;
public class Player {
    private int x; 
    private int y;
    private int size;
    private Color color;
    private int xInc;
    private int yInc;
    public Player(){
        size = 55;
        x = 1350/2-size/2;
        y = 750-size-5;
        color = Color.WHITE;
    }
    public void move() {
        
    }
    public void draw (Graphics page) {
        page.setColor(color);
        page.fillOval(x,y,size,size);
    }
}

