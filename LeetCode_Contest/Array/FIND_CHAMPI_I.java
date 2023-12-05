package LeetCode_Contest.Array;

public class FIND_CHAMPI_I {
    
    public static void main(String[] args) {
        int arr[][]={{1,1},{0,1},{0,1}};
        System.out.println(findChampion(arr));
    }

    public static int findChampion(int[][] arr) {
        int ans=Integer.MIN_VALUE;
        int sum=-1;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr[i].length;j++){
                if( arr[i][j]==1){
                    count++ ;
                }
            }
             if( ans<count){
                sum=i;
            }
            ans=Math.max(ans,count);
           
        }
        return sum;
    }
}
