package Greed;

public class Check_Gride {
    public static void main(String[] args) {
        int arr[][]={{4,4},{4,4}};
        System.out.println(satisfiesConditions(arr));
    }
    static boolean satisfiesConditions(int[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(i+1<grid.length && grid[i][j]!=grid[i+1][j]){
                    return false;
                }
                if(j+1<grid[0].length && grid[i][j]==grid[i][j+1]){
                      return false;
                }
               
            }
        }
        return true;
    }
}
