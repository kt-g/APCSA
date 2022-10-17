import java.util.Scanner;
public class GuessGame
{
    private int target;
    private Player a;
    private Player b;
    private Player c;
    public GuessGame()
    {
        target = (int)(Math.random()*100)+1;
        Scanner scan = new Scanner(System.in);
        Scanner scanNum = new Scanner(System.in);
        System.out.println("Player 1, enter your name: ");
        String name = scan.nextLine();
        System.out.println("Player 1, enter a guess from 1 to 100: ");
        int guess = scanNum.nextInt();
        //create Player object
        a = new Player(name, guess);
        
        System.out.println("Player 2, enter your name: ");
        name = scan.nextLine();
        System.out.println("Player 2, enter a guess from 1 to 100: ");
        guess = scanNum.nextInt();
        //second Player object
        b = new Player(name, guess);
        
        System.out.println("Player 3, enter your name: ");
        name = scan.nextLine();
        System.out.println("Player 3, enter a guess from 1 to 100: ");
        guess = scanNum.nextInt();
        //second Player object
        c = new Player(name, guess);
    }
    public void play()
    {
        int distanceA = target - a.getGuess();
        int distanceB = target - b.getGuess();
        int distanceC = target - c.getGuess();
        if (distanceA<0)
        {
            distanceA *= -1;
        }
        if (distanceB<0)
        {
            distanceB *= -1;
        }
        if (distanceC<0)
        {
            distanceC *= -1;
        }
        System.out.println("The target is " + target);
        boolean x = distanceA<distanceB;
        boolean y = distanceA<distanceC;
        boolean z = distanceB<distanceC;
        System.out.println(a.getName() + " scored " + (100-distanceA));
        System.out.println(b.getName() + " scored " + (100-distanceB));
        System.out.println(c.getName() + " scored " + (100-distanceC));
        if (x && y && z)
        //A<B<C
        {
            System.out.println(a.getName() + " wins!");
        }
        else if (x && y && !z)
        //A<C<B, A<C=B
        {
            System.out.println(a.getName() + " wins!");
        }
        else if (!x && y && z)
        //B<A<C, B=A<C
        {
            System.out.println(b.getName() + " wins!");
            if (distanceA==distanceB)
            {
                System.out.println(a.getName() + " wins too!");
            }
        }
        else if (!x && !y && z)
        //B<C<A, B<C=A
        {
            System.out.println(b.getName() + " wins!");
        }
        else if (x && !y && !z)
        //C<A<B,C=A<B 
        {
            System.out.println(c.getName() + " wins!");
            if (distanceA==distanceC)
            {
                System.out.println(a.getName() + " wins too!");
            }
        }
        else if (!x && !y && !z)
        //CBA, C=B<A, C=B=A
        {
            System.out.println(c.getName() + " wins!");
            if (distanceB==distanceC)
            {
                System.out.println(b.getName() + " wins too!");
                if (distanceC==distanceA)
                {
                    System.out.println(a.getName() + " wins too!");
                }
            }
        }
    }
}