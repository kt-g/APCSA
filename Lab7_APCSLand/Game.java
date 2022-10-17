import java.util.Scanner;
public class Game
{
    private Player a;
    private Player b;
    private Player c;
    private int roll;
    Scanner input = new Scanner(System.in);
    public Game()
    {
        System.out.println("Player 1, enter your name:");
        String name = input.nextLine();
        a = new Player(name, 0);
        System.out.println("Player 2, enter your name:");
        name = input.nextLine();
        b = new Player(name,0);
        System.out.println("Player 3, enter your name:");
        name = input.nextLine();
        c = new Player(name,0);
    }
    private int getRoll()
    {
        int dice1=(int)(Math.random()*6+1);
        int dice2=(int)(Math.random()*6+1);
        roll=dice1+dice2; 
        return roll;
    }
    public void print(String name)
    {
        if (roll==2 || roll==12)
        {
            System.out.println(name+" loses a turn");
        }
        else if (roll==7)
        {
            System.out.println(name+" goes back 7 spaces");
        }
        else if (roll==5)
        {
            System.out.println(name+" loses two turns");
        }
        else if (roll>0)
        {
            System.out.println(name+" moves forward "+roll+" spaces");
        }
        else
        {
            System.out.println(name+" moves backward "+(-roll)+" spaces");
        }
    }
    public void playGame()
    {
        int turn = 0;
        String cont; 
        boolean over = ((a.getPosition()>40||b.getPosition()>40)||c.getPosition()>40);
        boolean turnA = true;
        boolean turnB = true;
        boolean turnC = true;
        System.out.println(a.getName()+"'s Position: START");
        System.out.println(b.getName()+"'s Position: START");
        System.out.println(c.getName()+"'s Position: START");
        System.out.println("");
        while (!over)
        {
            turn++;
            System.out.println("turn: "+turn);
            //player A
            if (turn%3==1 && turnA)
            {
                getRoll();
                a.changePosition(roll);
                System.out.println(a.getName() + " rolled a " + roll);
                if (a.getPosition()>41)
                {
                    a.changePosition(-roll);
                    roll = 1; 
                    a.changePosition(roll);
                }
                print(a.getName());
                if (roll==5)
                {
                    turnA = false;
                }
                roll=-10;
                if (a.getPosition()>0)
                {
                    if (a.getPosition()==b.getPosition())
                    {
                        b.changePosition(roll);
                        print(b.getName());
                        if (b.getPosition()==c.getPosition()&&b.getPosition()>0)
                        {
                            c.changePosition(roll);
                            print(c.getName());
                        }
                    }
                    else if (a.getPosition()==c.getPosition())
                    {
                        c.changePosition(roll);
                        print(c.getName());
                        if (c.getPosition()==b.getPosition()&&b.getPosition()>0)
                        {
                            b.changePosition(roll);
                            print(b.getName());
                        }
                    }
                }
            }
            else if (turn%3==1 && !turnA)
            {
                System.out.println(a.getName()+" rolled 5 last turn. Skip this turn");
                turnA = true;
            }
            //player B
            if (turn%3==2&& turnB)
            {
                getRoll();
                b.changePosition(roll);
                System.out.println(b.getName() + " rolled a " + roll);
                if (b.getPosition()>41)
                {
                    b.changePosition(-roll);
                    roll = 1; 
                    b.changePosition(roll);
                }
                print(b.getName());
                if (roll==5)
                {
                    turnB = false;
                }
                roll=-10;
                if (b.getPosition()>0)
                {
                    if (b.getPosition()==a.getPosition())
                    {
                        a.changePosition(roll);
                        print(a.getName());
                        if (a.getPosition()==c.getPosition()&&a.getPosition()>0)
                        {   
                            c.changePosition(roll);
                            print(c.getName());
                        }
                    }
                    else if (b.getPosition()==c.getPosition())
                    {
                        c.changePosition(-10);
                        print(c.getName());
                        if (a.getPosition()==c.getPosition()&&a.getPosition()>0)
                        {
                            a.changePosition(-10);
                            print(a.getName());
                        }
                    }
                }
            }
            else if (turn%3==2&&!turnB)
            {
                System.out.println(b.getName()+" rolled 5 last turn. Skip this turn");
                turnB = true;
            }
            //player C
            if (turn%3==0 && turnC)
            {
                getRoll();
                c.changePosition(roll);
                System.out.println(c.getName() + " rolled a " + roll);
                if (c.getPosition()>41)
                {
                    c.changePosition(-roll);
                    roll = 1; 
                    c.changePosition(roll);
                }
                print(c.getName());
                if (roll==5)
                {
                    turnC = false;
                }
                roll = -10;
                if (c.getPosition()>0)
                {
                    if (c.getPosition()==a.getPosition())
                    {
                        a.changePosition(roll);
                        print(a.getName());
                        if (a.getPosition()==b.getPosition()&&a.getPosition()>0)
                        {
                            b.changePosition(roll);
                            print(b.getName());
                        }
                    }
                    else if (b.getPosition()==c.getPosition())
                    {
                        b.changePosition(roll);
                        print(b.getName());
                        if (a.getPosition()==b.getPosition()&&a.getPosition()>0)
                        {
                            a.changePosition(roll);
                            print(a.getName());
                        }
                    }
                }
            }
            else if (turn%3==0&&!turnC)
            {
                System.out.println(c.getName()+" rolled 5 last turn. Skip this turn");
                turnC = true;
            }
            a.setPosition();
            b.setPosition();
            c.setPosition();
            //print positions
            if (a.getPosition()<=0)
            {
                System.out.println(a.getName()+"'s Position: START");
            }
            else if (a.getPosition()>40)
            {
                System.out.println(a.getName()+"'s Position: FINISH");
                break;
            }
            else 
            {
                System.out.println(a.getName()+"'s Position: " + a.getPosition());
            }
            if (b.getPosition()<=0)
            {
                System.out.println(b.getName()+"'s Position: START");
            }
            else if (b.getPosition()>40)
            {
                System.out.println(b.getName()+"'s Position: FINISH");
                break;
            }
            else 
            {
                System.out.println(b.getName()+"'s Position: " + b.getPosition());
            }
            if (c.getPosition()<=0)
            {
                System.out.println(c.getName()+"'s Position: START");
            }  
            else if (c.getPosition()>40)
            {
                System.out.println(c.getName()+"'s Position: FINISH");
                break;
            }
            else 
            {
                System.out.println(c.getName()+"'s Position: " + c.getPosition());
            }
            System.out.println("Press a key to continue:");
            cont = input.nextLine();
        }
        if (a.getPosition()>40)
        {
            System.out.println("Congrats, " + a.getName());
            System.out.println("Better luck next time, "+b.getName()+" and "+c.getName());
        }
        else if (b.getPosition()>40)
        {
            System.out.println("Congrats, " + b.getName());
            System.out.println("Better luck next time, " + a.getName()+" and "+c.getName());
        }
        else 
        {
            System.out.println("Congrats, " + c.getName());
            System.out.println("Better luck next time, " + a.getName()+" and "+b.getName());
        }
    }
}