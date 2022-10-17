import java.util.Scanner;
import java.io.*;
public class ClumpRemover{
    private boolean [][] Cells;
    public ClumpRemover(){
        Cells = new boolean[22][22];
        try{
            Scanner sc = new Scanner(new File("digital.txt"));
            int nPairs = sc.nextInt();
            for(int p = 0; p < nPairs;p++){
                int nRow = sc.nextInt();
                int nCol = sc.nextInt();
                Cells[nRow][nCol] = true;
            }
        }
        catch(FileNotFoundException ex){
            System.out.println("No File");
        }
    }
    public void print(){
        System.out.println();
        for(int r = 0; r < Cells.length-1; r++){
            for(int c = 0; c < Cells[r].length-1; c++){
                if(r == 0){
                    if( c < 10 ){
                        System.out.print("0" + c + " ");
                    }
                    else{
                        System.out.print(c + " ");    
                    }
                    continue;
                }
                if(c == 0){
                    if( r < 10 ){
                        System.out.print("0" + r + " ");
                    }
                    else{
                        System.out.print(r + " ");    
                    }
                    continue;
                }
                if(Cells[r][c] == true){
                    System.out.print("Q  ");
                }
                else{
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }
    }
    public void eraseCell(int row, int col){
        if(Cells[row][col] == false){
            return;
        }
        Cells[row][col] = false;
        for(int r = row-1; r <= row+1; r++){
            for(int c = col-1; c <= col+1; c++){
                if(r == row && c == col){
                    continue;
                }
                if(Cells[r][c] == true){
                    eraseCell(r, c);
                }
            }
        }
    }
}