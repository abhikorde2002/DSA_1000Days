package Greed;

public class Min_Op_Condition {
    public static void main(String[] args) {
        int arr[][]={{1,1,1},{0,0,0}};
        System.out.println(satisfiesConditions(arr));
    }

    public static int satisfiesConditions(int[][] grid) {
        int cou=0;
        for (int i = 0; i < grid.length; i++) {
           for (int j = 0; j < grid[0].length; j++) {
               if(i+1<grid.length && grid[i][j]!=grid[i+1][j]){
                   cou++ ;
               }
               if(j+1<grid[0].length && grid[i][j]==grid[i][j+1]){
                      cou++;
                      i++;
               }
              
           }
       }
       return cou;
   }
}
