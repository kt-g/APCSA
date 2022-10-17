public class Queen {
    private boolean[][] board; 
    public Queen(){
       board = new boolean[10][10];
    }
    public void print(){
        //System.out.println();
        for(int r = 0; r < board.length-1; r++){
            for(int c = 0; c < board[r].length-1; c++){
                if(r == 0){
                    if( c < 10 ){
                        System.out.print((char)(c+64) + "  ");
                    }
                    continue;
                }
                if(c == 0){
                    System.out.print(9-r + "  ");
                    continue;
                }
                if(board[r][c] == true){
                    System.out.print("Q  ");
                }
                else{
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }
    }
    public void place(){
        
    }
}
