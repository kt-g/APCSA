import java.util.Scanner;
public class Driver {
    public static void main () {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double x = input.nextDouble();
        System.out.println("Enter another number: ");
        double y = input.nextDouble();
        
        System.out.println("Which operation?");
        System.out.println("Press 1(+), 2(-), 3(*), 4(/), 5(%), 6(>), 7(^2)");
        int op = input.nextInt();
        
        Calculator calc = new Calculator(x, y);
        if (op==1) {
            calc.add();
        }
        else if (op==2) {
            calc.subtract();
        }
        else if (op==3) {
            calc.multiply();
        }
        else if (op==4) {
            calc.divide();
        }
        else if (op==5) {
            calc.mod();
        }
        else if (op==6) {
            calc.compare();
        }
        else if (op==7) {
            calc.square();
        }
        else {
            System.out.println("Error: not a valid operation");
        }
    }
}