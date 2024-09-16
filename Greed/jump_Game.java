package Greed;

public class jump_Game {
    public static void main(String[] args) {
        int arr[]={3,0,8,2,0,0,1};
        //System.out.println(canJump(arr));
        //System.out.println(jump(arr));
    }
   
    // static int jump(int[] arr) {
    //     int maxInd=Integer.MAX_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         //if(maxInd<i){return false;}
    //         maxInd=Math.min(maxInd,i+arr[i]);
    //     }
    //     return maxInd;
    // }
    public static boolean canJump(int[] arr) {
        int maxInd=0;
        for(int i=0;i<arr.length;i++){
            if(maxInd<i){return false;}
            maxInd=Math.max(maxInd,i+arr[i]);
        }
        return true;
    }
}
