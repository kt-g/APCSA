import java.util.Scanner;
public class Driver
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of integers in the array.");
        int elements = input.nextInt();
        System.out.println("Enter the maximum value in the array.");
        int max = input.nextInt();
        System.out.println("Enter the minimum value in the array.");
        int min = input.nextInt();
        Array a = new Array (elements, max, min);
        a.calculate();
    }
}
