import java.awt.*;
public class Ball {
    private int x; 
    private int y;
    private int size;
    private Color color;
    private int xInc;
    private int yInc;
    public Ball(){
        x = 660;
        y = 375;
        xInc = (int)(Math.random()*7)-3;
        yInc = (int)(Math.random()*7)-3;
        if (yInc < Math.abs(2)){
            yInc+=2;
        }
        size = 50;
        color = Color.GRAY;
    }   
    public void draw (Graphics page) {
        page.setColor(color);
        page.fillOval(x,y,size,size);
    }
    public void move() {
        x+=xInc;
        y+=yInc;
        if (x<0 || x>1350-size) {
            bounceX();
        }
        if (y<0 || y>750-size) {
            bounceY();
        }
    }
    public void bounceX() {
        xInc*=-1;
    }
    public void bounceY() {
        yInc*=-1;
    }
    public int radius() {
        return size/2; 
    }
    public int getX() {
        return x+size/2;
    }
    public int getY() {
        return y-size/2;
    }
}
