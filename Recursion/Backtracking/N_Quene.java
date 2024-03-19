package Recursion.Backtracking;

public class N_Quene {
    public static void main(String[] args) {
        boolean arr[][]=new boolean[4][4];
        System.out.println(queen(arr, 0));
    }


    static int queen(boolean[][] board,int row ){
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int cou=0;
        for(int col=0;col<board.length ;col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                cou+=queen(board, row+1);
                board[row][col]=false;
            }
        }
        return cou;
    }
    static boolean isSafe(boolean [][]board,int row,int col){
           //check verticaly
           for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row-i][col-i]) {
                return false;
            }
        }

        // diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i]) {
                return false;
            }
        }

        return true;
    }
    static void display(boolean [][]arr){
        for(boolean[] boarde: arr){
             for(boolean ele:boarde){
                if(ele){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
             }
             System.out.println();
        }
    }
}
