import java.awt.*;
public class Coin {
    private int x; 
    private int y;
    private int size;
    private Color color;
    public Coin (){
        size = 30;
        x = (int)(Math.random()*1350);
        if (x>1350-size) {
            x-=size;
        }
        y = (int)(Math.random()*750);
        if (y>1350-size) {
            y-=size;
        }
        color = Color.YELLOW;
    }
    public void draw (Graphics page) {
        page.setColor(color);
        page.fillOval(x,y,size,size);
    }
    public int getX() {
        return x+size/2;
    }
    public int getY() {
        return y-size/2;
    }
    public int radius() {
        return size/2; 
    }
    public void move() {
        x+=5000;
        y+=1536;
    }
}