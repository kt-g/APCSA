import java.awt.*;
public class Square {
    private int x;
    private int y;
    private int size;
    private Color color;
    private int xInc;
    private int yInc;
    public Square () {
        x = (int)(Math.random()*800);
        y = (int)(Math.random()*400);
        xInc = (int)(Math.random()*100)-3;
        yInc = (int)(Math.random()*100)-3;
        size = (int)(Math.random()*100)+50;
        color = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
    }
    public void draw (Graphics page) {
        page.setColor(color);
        page.fillRect(x,y,size,size);
    }
    public void move() {
        x+=xInc;
        y+=yInc;
        if (x<0 || x>1200-size) {
            bounceX();
        }
        if (y<0 || y>700-size) {
            bounceY();
        }
    }
    public void bounceX() {
        xInc*=-1;
    }
    public void bounceY() {
        yInc*=-1;
    }
}