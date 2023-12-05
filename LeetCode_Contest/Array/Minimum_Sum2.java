package LeetCode_Contest.Array;

public class Minimum_Sum2 {
    public static void main(String[] args) {
        int arr[]={8,6,1,5,3};
        System.out.println(minimum(arr));
    }

    static int minimum(int arr[]){
       int left[]=new int[arr.length];
       int right[]=new int[arr.length];
       int sum=Integer.MAX_VALUE;
       left[0]=arr[0];
       for(int i=1;i<arr.length;i++){
         left[i]=Math.min(left[i-1], arr[i]);
       }
       right[arr.length-1]=arr[arr.length-1];
       for(int i=arr.length-2;i>=0;i--){
        right[i]=Math.min(right[i+1], arr[i]);
       }

       for(int i=0;i<arr.length;i++){
        if(left[i]<arr[i] && arr[i]>right[i]){
            sum= Math.min(sum, left[i]+arr[i]+right[i]);
        }
       }
       return sum!=Integer.MAX_VALUE ?sum : -1;
    }
}
