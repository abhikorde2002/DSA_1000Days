package Recursion.Backtracking;

public class K_Knight {
    public static void main(String[] args) {
        boolean arr[][]= new boolean[4][4];
        // System.out.println();
        Knight(0, arr, 0, 4);
    }

    static void Knight(int row,boolean arr[][],int col,int knight){
       if(knight ==0 ){
        display(arr);
        System.out.println();
       }
       if(row==arr.length-1 && col==arr.length){
         return ;
       }

       if(col== arr.length){
        Knight(row+1, arr, 0, knight);
        return;
       }

       if(isSafe(arr,row,col)){
        arr[row][col]=true;
        Knight(row, arr, col+1, knight-1);
        arr[row][col]=false;
    }
    Knight(row, arr, col+1, knight);
    }
    
    static boolean isSafe(boolean [][]arr,int row,int col){
       if(isValid(arr, row-2, col-1)){
        if(arr[row-2][col-1]){
            return false;
        }
       }
       if(isValid(arr, row-2, col+1)){
        if(arr[row-2][col+1]){
            return false;
        }
       }
       if(isValid(arr, row-1, col-2)){
        if(arr[row-1][col-2]){
            return false;
        }
       }
       if(isValid(arr, row-1, col+2)){
        if(arr[row-1][col+2]){
            return false;
        }
       }
       return true;
    }

    static boolean isValid(boolean arr[][],int row,int col){
        if(row>=0 && row<arr.length && col>=0 && col<arr.length){
            return true;
        }
        return false;
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
