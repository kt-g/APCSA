import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Board extends JPanel {
    private Ball ball;
    private Coin[] coins;
    private Player p;
    public Board () { 
        this.setLayout(null);
        this.setBackground(Color.BLACK);
        this.setPreferredSize(new Dimension(1350,750));
        ball = new Ball();
        coins = new Coin[10];
        p = new Player();
        for (int i = 0; i<coins.length; i++) {
            coins[i]= new Coin();
        }
    }
    public void play() {
        while (true) {
            ball.move();
            this.repaint();
            for (int i=0; i<coins.length; i++) {
                double xDiff = ball.getX()-coins[i].getX();
                double yDiff = ball.getY()-coins[i].getY();
                if (Math.sqrt(xDiff*xDiff+yDiff*yDiff)<(ball.radius()+coins[i].radius())) {
                    coins[i].move();
                }
            }
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException ex){
                
            }
        }
    }
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        ball.draw(page);
        for (int i = 0; i<coins.length; i++) {
            coins[i].draw(page);
        }
        p.draw(page);
    }
}