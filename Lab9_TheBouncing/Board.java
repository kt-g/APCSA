import javax.swing.*;
import java.awt.*;
public class Board extends JPanel {
    private Ball[] balls ;
    private Square[] squares;
    public Board () { 
        this.setLayout(null);
        this.setBackground(Color.BLACK);
        this.setPreferredSize(new Dimension(1200,700));
        balls = new Ball[7];
        squares = new Square[3];
        for (int i = 0; i<balls.length; i++) {
            balls[i]= new Ball();
        }
        for (int i = 0; i<squares.length; i++) {
            squares[i]= new Square();
        }
    }
    public void go() {
        while (true) {
            for (int i = 0; i<balls.length; i++) {
                balls[i].move();
                this.repaint();
                try {
                    Thread.sleep(10);
                }
                catch (InterruptedException ex){
                
                }
            }
            for (int i = 0; i<squares.length; i++) {
                squares[i].move();
                this.repaint();
                try {
                    Thread.sleep(10);
                }
                catch (InterruptedException ex){
                
                }
            }
        }
    }
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        for (int i = 0; i<balls.length; i++) {
            balls[i].draw(page);
        }
        for (int i = 0; i<squares.length; i++) {
            squares[i].draw(page);
        }
    }
}