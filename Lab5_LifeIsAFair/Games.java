import java.util.Scanner;
public class Games 
{
    private int type;
    Scanner scan = new Scanner (System.in);
    public Games(int choice)
    {
        type = choice;
    }
    public int getType()
    {
        return type;
    }
    public void play()
    {
        if (type == 1)
        {
            RPS();
        }
        else if (type == 2)
        {
            Roulette();
        }
        else if (type == 3)
        {
            CoinFlip();
        }
        else
        {
            System.out.println("Not a valid input");
        }
    }
    public void RPS()
    {
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Choose a hand:");
        System.out.println("Press 1 for Rock, 2 for Paper, or 3 for Scissors");
        int user = scan.nextInt();
        int computer = (int)((Math.random()*3)+1);
        if (user==1)
        {
            System.out.println("You played rock.");
        }
        if (user==2)
        {
            System.out.println("You played paper.");
        }
        if (user==3)
        {
            System.out.println("You played scissors.");
        }
        if (computer==1)
        {
            System.out.println("Computer played rock.");
        }
        if (computer==2)
        {
            System.out.println("Computer played paper.");
        }
        if (computer==3)
        {
            System.out.println("Computer played scissors.");
        }
        
        if (user == computer)
        {
            System.out.println("You tied.");
        }
        if ((user==1 && computer==3)||(user==2 && computer==1)||(user==3 && computer==2))
        {
            System.out.println("Congratulations, you win!");
        }
        else
        {
           System.out.println("You lose."); 
        }
    }
    public void Roulette()
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome to Roulette Wheel");
        System.out.println("Choose a colour:");
        System.out.println("Enter 'red', 'black', or 'green'");
        String user = scan.nextLine();
        int computer = (int)((Math.random()*37));
        String result;
        if ((computer >= 1 && computer <=10)||(computer >= 19 && computer <=28))
        {
            if (computer % 2 == 0)
            {
                result = "black"; 
            }
            else
            {
                result = "red";
            }
        }
        else if ((computer >= 11 && computer <=18)||(computer >= 29 && computer <=36))
        {
            if (computer % 2 == 0)
            {
                result = "red"; 
            }
            else
            {
                result = "black";
            }
        }
        else
        {
            result = "green";
        }
        if (user.equals(result))
        {
            System.out.println("The ball landed on " + computer);
            System.out.println(computer + " is a " + result + " number");
            System.out.println("Congratulations, you win!");
        }
        else
        {
            System.out.println("The ball landed on a " + computer);
            System.out.println(computer + " is a " + result + " number");
            System.out.println("You lose");
        }
    }
    public void CoinFlip()
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome to Coin Flip");
        System.out.println("Press 0 for heads or 1 for tails");
        int user = scan.nextInt();
        int computer = (int)((Math.random()*2));
        if (user == computer)
        {
            if (computer == 0)
            {
                System.out.println("The coin landed heads");
            }
            if (computer == 1)
            {
                System.out.println("The coin landed tails");
            }
            System.out.println("You win!");
        }
        else
        {
            if (computer == 0)
            {
                System.out.println("The coin landed heads");
            }
            if (computer == 1)
            {
                System.out.println("The coin landed tails");
            }
            System.out.println("You lose.");
        }
    }
}