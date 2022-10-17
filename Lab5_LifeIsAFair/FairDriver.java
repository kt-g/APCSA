import java.util.Scanner;
public class FairDriver
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        boolean play = true;
        System.out.println("Welcome! Which game would you like to play?");
        while (play)
        {
            System.out.println("Press 1 for Rock, Paper, Scissors");
            System.out.println("Press 2 for Roulette Wheel");
            System.out.println("Press 3 for Coin Flip");
            int choice = input.nextInt();
            Attendant a = new Attendant(choice);
            a.playGame();
            System.out.println("Would you like to play again? Press 1 for yes.");
            int again = input.nextInt();
            if (again != 1)
            {
                play = false;
            }
        }
    }
}
