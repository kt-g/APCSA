import java.util.Scanner;
public class Driver {
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Purchase Price: ");
        double total = input.nextDouble();
        System.out.println("Cash Tendered: ");
        double cash = input.nextDouble();
        
        Return change = new Return (total, cash);
        change.makeChange();
    }    
}