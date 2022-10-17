import java.util.Scanner;
public class MailChecker
{
    private Package p;
    public MailChecker()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first dimension of the package: ");
        int x = input.nextInt();
        System.out.println("Enter the second dimension of the package: ");
        int y = input.nextInt();
        System.out.println("Enter the third dimension of the package: ");
        int z = input.nextInt();
        System.out.println("Enter the weight of the package: ");
        int w = input.nextInt();
        p = new Package (x, y, z, w);
    }
    public void check()
    {
        System.out.println("Package weight: " + p.getWeight());
        System.out.println("Package size: " + (p.getLength() + p.getGirth()));
        if ((p.getLength() + p.getGirth()) > 100 && p.getWeight() > 70)
        {
            System.out.println("Package is too large and too heavy");
            System.out.println("Package is too large by " + (p.getLength() + p.getGirth()-100));
            System.out.println("Package is too heavy by "+(p.getWeight()-70));
        }
        else if (p.getWeight() > 70)
        {
            System.out.println("Package is too heavy");
            System.out.println("Package is too heavy by "+(p.getWeight()-70));
        }
        else if ((p.getLength() + p.getGirth()) > 100)
        {
            System.out.println("Package is too large");
            System.out.println("Package is too large by " + (p.getLength() + p.getGirth()-100));
        }
        else
        {
            System.out.println("Package may be shipped first class");
        }
    }
}