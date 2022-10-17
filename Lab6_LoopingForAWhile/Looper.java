import java.util.Scanner;
public class Looper
{
    private Loops loop;
    public Looper()
    {
        Scanner input = new Scanner(System.in);
        boolean play = true;
        System.out.println("Pick an action!");
        while (play)
        {
            System.out.println("Press 1 for Calculate GPA");
            System.out.println("Press 2 for Check Prime");
            System.out.println("Press 3 for Average Test Score");
            System.out.println("Press 4 for Least Common Multiple");
            System.out.println("Press 5 for Reverse the Digits");
            int choice = input.nextInt();
            loop = new Loops(choice);
            loop.play();
            System.out.println("Would you like to play again? Press 1 for yes.");
            int again = input.nextInt();
            if (again != 1)
            {
                play = false;
            }
        }
    }
}