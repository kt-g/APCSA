import java.util.Scanner;
public class Array
{
    private int elements;
    private int max;
    private int min;
    private int [] array;
    Scanner input = new Scanner (System.in);
    public Array(int a, int b, int c)
    {
        elements = a;
        max = b;
        min = c;
        array = new int [elements];
        for (int i=0; i<array.length; i++)
        {
            array [i] = (int)(Math.random()*(max-min))+min;
        }
    }
     public void calculate() {
        int choice = 0;
        while (choice!=-1) {
            System.out.println("Choose a calculation.");
            System.out.println("Press 1 for average.");
            System.out.println("Press 2 for range.");
            System.out.println("Press 3 for instances of value.");
            System.out.println("Press 4 for number of odd/even numbers.");
            choice = input.nextInt();
            print();
            if (choice==1) {
                System.out.println("average= "+average());
            }
            else if (choice==2) {
                System.out.println("range= "+range());
            }
            else if (choice==3) {
                System.out.println("Find number of instances of: ");
                int val = input.nextInt();
                System.out.println("instances of "+val+" = "+value(val));
            }
            else if (choice==4) {
                System.out.println("number of odd numbers: "+odd());
                System.out.println("number of even numbers: "+(array.length-odd()));
            }
            System.out.println("Press -1 to stop playing");
            choice = input.nextInt();
        }
    }
    public double average() {
        int total=0;
        for (int i=0; i<array.length; i++) {
            total+=array[i];
        }
        return (double)total/array.length;
    }
    public int range() {
        int maximum = array[0];
        int minimum = array[0];
        for (int i=0; i<array.length; i++) {
            if (array[i]>maximum) {
                maximum = array[i];
            }
            else if (array[i]<minimum) {
                minimum = array[i];
            }
        }
        System.out.println("maximum= "+maximum);
        System.out.println("minimum= "+minimum);
        return maximum-minimum;
    }
    public int value(int v) {
        int instances=0;
        for (int i=0; i<array.length; i++) {
            if (array[i]==v) {
                instances++;
            }
        }
        return instances;
    }
    public int odd() {
        int instances=0;
        for (int i=0; i<array.length; i++) {
            if (array[i]%2!=0) {
                instances++;
            }
        }
        return instances;
    }
    public void print() {
        for (int i=0; i<array.length; i++) {
            System.out.print("["+i+"] = ");
            System.out.println(array[i]);
        }
    }
}
