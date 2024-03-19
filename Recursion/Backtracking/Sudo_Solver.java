package Recursion.Backtracking;

public class Sudo_Solver {
      public static void main(String[] args) {
        int arr[][]=new int[][]{
            {3,0,6,5,0,8,4,0,0},
            {5,2,0,0,0,0,0,0,0},
            {0,8,7,0,0,0,0,3,1},
            {0,0,3,0,1,0,0,8,0},
            {9,0,0,8,6,3,0,0,5},
            {0,5,0,0,9,0,6,0,0},
            {1,3,0,0,0,0,2,5,0},
            {0,0,0,0,0,0,0,7,4},
            {0,0,5,2,0,6,3,0,0}};

            System.out.println(solve(arr));
        }
        
      
      

      static boolean solve(int [][]arr){
        int n= arr.length;
        int row=-1;
        int col=-1;

        boolean empty=true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j]==0){
                    row=i;
                    col=j;
                    empty=false;
                    break;
                }
            }
            if (empty==false) {
                break;
            }
        }
        if (empty==true) {
            return true;
        }

        for (int i = 1; i <= 9; i++) {
            if (isSafe(arr, row, col, i)) {
                arr[row][col]=i;

                if (solve(arr)) {
                    display(arr);
                    System.out.println();
                    return true;
                }
                else{
                    arr[row][col]=0;
                }
            }
        }
        return false;
      }
      static void display(int arr[][]){
        for(int num[]:arr){
            for(int a:num){
                System.out.print(a + " ");
            }
            System.out.println();
        }
      }
      static boolean isSafe(int arr[][],int row,int col,int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[row][i]==num) {
                return false;
            }
        }

        for(int nums[]:arr){
          if (nums[col]==num) {
             return false;
          }
        }
        int sqrt=(int)(Math.sqrt(arr.length));
        int rowStart=row - row %sqrt;
        int colStart= col -col %sqrt;

        for (int r = rowStart; r < rowStart+sqrt; r++) {
            for (int c = colStart; c < colStart+sqrt; c++) {
                if (arr[r][c]==num) {
                    return false;
                }
            }
        
        }
        return true;
      }
}
