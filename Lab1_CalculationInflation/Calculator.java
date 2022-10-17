public class Calculator {
    private double num1;
    private double num2;
    public Calculator(double n1, double n2) 
    {
        num1 = n1;
        num2 = n2;
    }
    public void add() 
    {
        double sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
    }
    public void subtract() 
    {
        double difference = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + difference);
    }
    public void multiply() 
    {
        double product = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + product);
    }
    public void divide() 
    {
        double quotient = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + quotient);
    }
    public void mod() 
    {
        double remainder = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + remainder);
    }
    public void compare() 
    {
        if (num1 > num2){
            System.out.println(num1 + " > " + num2);
        }
        else if (num1 < num2){
            System.out.println(num1 + " < " + num2);
        }
        else {
            System.out.println(num1 + " = " + num2);
        }
    }
    public void square()
    {
        System.out.println(num1 + "^2 = " + (num1*num1));
        System.out.println(num2 + "^2 = " + (num2*num2));
    }
}