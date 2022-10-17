import java.util.Scanner;
import java.io.*;
public class Life {
    private boolean[][]bacteria;
    public Life(){
        bacteria = new boolean[22][22];
        try{
            Scanner scan = new Scanner(new File("life100.txt"));
            int numPairs = scan.nextInt();
            for(int i=0; i<numPairs; i++){
                int row = scan.nextInt();
                int col = scan.nextInt();
                bacteria[row][col] = true;
            }
        }
        catch( FileNotFoundException ex ){
            System.out.println("No file");
        }
    }
    public void print(){
        for(int r=0; r<bacteria.length; r++){
            for(int c=0; c<bacteria[0].length; c++){
                if(bacteria[r][c]==true){
                    System.out.print("*");
                }
                else{
                   System.out.print(" "); 
                }
            }
            System.out.println();
        }
    }
    public void generation(){
        boolean[][]temp = new boolean[22][22];
        for(int r=1; r<bacteria.length-1; r++){
            for(int c=1; c<bacteria[0].length-1; c++){
                if(bacteria[r][c]==false){
                    if(neighbours(r,c)==3){
                        temp[r][c]=true;
                    }
                    else{
                        temp[r][c]=false;
                    }
                }
                else{  
                    if(neighbours(r,c)<=1 || neighbours(r,c)>=4){
                        temp[r][c]=false;
                    }
                    else{
                        temp[r][c]=true;
                    }
                }
            }
        }
        bacteria = temp;
    }
    public int neighbours(int row, int col){
        int total = 0;
        for(int r=row-1; r<=row+1; r++){
            for(int c=col-1; c<=col+1; c++){
                if(bacteria[r][c]==true){
                    total++;
                }
            }
        }
        if(bacteria[row][col]==true){
            return total-1;
        }
        return total;
    }
}