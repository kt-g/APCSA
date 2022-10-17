import java.awt.*;
public class Ball {
    private int x; 
    private int y;
    private int size;
    private Color color;
    private int xInc;
    private int yInc;
    public Ball () {
        x = (int)(Math.random()*800);
        y = (int)(Math.random()*400);
        xInc = (int)(Math.random()*7)-3;
        yInc = (int)(Math.random()*7)-3;
        size = (int)(Math.random()*100)+50;
        color = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
    }
    public void draw (Graphics page) {
        page.setColor(color);
        page.fillOval(x,y,size,size);
    }
    public void move() {
        x+=xInc;
        y+=yInc;
        
    }
    public void bounceX() {
        xInc*=-1;
    }
    public void bounceY() {
        yInc*=-1;
    }
}