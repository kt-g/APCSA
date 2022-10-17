import java.util.Scanner;
public class Loops
{
    private int type;
    //number scan
    Scanner scan = new Scanner (System.in);
    //String scan
    Scanner input = new Scanner (System.in);
    public Loops (int choice)
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
            GPA();
        }
        else if (type == 2)
        {
            prime();
        }
        else if (type == 3)
        {
            average();
        }
        else if (type == 4)
        {
            LCM();
        }
        else if (type == 5)
        {
            reverse();
        }
        else 
        {
            System.out.println("Not a valid input");
        }
    }
    public void GPA()
    {
        int classes=0;
        double points=0;  
        System.out.println("Enter your grades. Press X when you are done");
        String grade = ":)";
        while (!grade.equals("X"))
        {
            grade = input.nextLine();
            if (grade.equals("A"))
            {
                points += 4.0;
            }
            else if (grade.equals("B"))
            {
                points += 3.0;
            }
            else if (grade.equals("C"))
            {
                points += 2.0;
            }
            else if (grade.equals("D"))
            {
                points += 1.0;
            }
            else if (grade.equals("F"))
            {
                
            }
            else if (!grade.equals("X"))
            {
                System.out.println("Not a valid grade.");
                classes--;
            }
            classes++;
        }
        classes --;
        double GPA = points/classes;
        System.out.println("You took " + classes + " classes");
        System.out.println("Your GPA is " + GPA);
    }
    public void prime()
    {
        System.out.println("Enter an integer");
        int num = scan.nextInt();
        if (num == 1)
        {
            System.out.println("Haha, very funny, but 1 is NOT a prime.");
            return;
        }
        int test = 2;
        while ((num%test)!=0 && (test*test)<num)
        {
            test++;
        }
        if ((num%test)==0)
        {
            System.out.println("The smallest factor of " + num + " is " + test);
        }
        else
        {
            System.out.println(num + " is a prime number.");
        }
    }
    public void average()
    {
        System.out.println("Enter the scores. Enter -1 when you are finished.");
        double num = scan.nextDouble();
        double lowest = num;
        double points = num;
        int students = 1;
        while (num!=-1)
        {
            num = scan.nextDouble();
            students++;
            points+=num;
            if (num<lowest&&num!=-1)
            {
                lowest = num;
            }
        }
        students--;
        points++;
        System.out.println("There were " + students + " students");
        System.out.println("The lowest score was " + lowest);
        double avg = (points-lowest)/(students-1);
        System.out.println("The average excluding the lowest score is " + avg);
    }
    public void LCM()
    {
        System.out.println("Enter an integer");
        int num1 = scan.nextInt();
        System.out.println("Enter another integer");
        int num2 = scan.nextInt();
        int counter = 2;
        int lcm;
         if (num1>=num2)
        {
            lcm = num1;
            while ((lcm%num2)!=0)
            {
                lcm = num1*counter;
                counter++;
            }             
        }
        else 
        {
            lcm = num2;
            while ((lcm%num1)!=0)
            {
                lcm = num2*counter;
                counter++;
            }
        }
        System.out.println("The LCM of " + num1 + ", " + num2 + " is " + lcm);
    }
    public void reverse()
    {
        System.out.println("Enter an integer");
        int num = scan.nextInt();
        int reverse = 0;
        while (num!=0)
        {
            int remainder = num%10;
            num /= 10;
            reverse = reverse*10 + remainder;
        }
        System.out.println("Your number in reverse is " + reverse);
    }
}