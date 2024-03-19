package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class N_Quen_List {
    public static void main(String[] args) {
      System.out.println(solveNQueens(4));
    }

    public static List<List<String>> solveNQueens(int n) {
        boolean [][] arr= new boolean[n][n];
         List<List<String>>  s= new ArrayList<>();
         queen(arr, 0, s);
        //  for(List<String> row : s) {
        //     for(String cell : row) {
        //         System.out.print(cell + " ");
        //     }
        //     System.out.println();
        // }
        return s;
       
    }

    public static void queen( boolean [][]arr,int row, List<List<String>>  s){
        if(row==arr.length){
            s.add(display(arr));
          
            return;
        }
        for(int col=0;col<arr.length;col++){
        if(isSafe(row,col,arr)){
            arr[row][col]=true;
            queen(arr, row+1, s);
            arr[row][col]=false;
        }

        }
    }
    public static boolean isSafe(int row,int col,boolean [][]arr){
        //Vertical
        for(int i=0;i<row;i++){
            if(arr[i][col]){
                return false;
            }
        }

        //digonaly left
        int maxLeft= Math.min(row, col);
        for(int i=1;i<=maxLeft;i++){
            if(arr[row-i][col-i]){
                return false;
            }

        }

        //digonaly right
        int maxRight= Math.min(row,arr.length -col-1);
        for(int i=1;i<=maxRight;i++){
            if(arr[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

    static List<String> display(boolean [][]board){
        List<String> config = new ArrayList<>();
        for(boolean[] boarde : board) {
            StringBuilder row = new StringBuilder();
            for(boolean ele : boarde) {
                if(ele) {
                    row.append("Q");
                } else {
                    row.append(".");
                }
            }
            config.add(row.toString());
        }
        return config;
    }

}
