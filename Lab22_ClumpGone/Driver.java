import java.util.Scanner;
public class Driver {
    public static void main(){
        ClumpRemover clump = new ClumpRemover();
        Scanner scan = new Scanner(System.in);
        while(true) {
            clump.print();
            System.out.print("What row of @ do you wanna remove:");
            int row = scan.nextInt();
            System.out.print("What column of @ do you wanna remove:");
            int col = scan.nextInt();
            clump.eraseCell(row, col);
        }
    }
}
