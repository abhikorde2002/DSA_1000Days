package Array.Advance_Array;

import java.util.Arrays;

public class Valid_Trangele {
    public static void main(String[] args) {
        int arr[]={4,2,3,4};
        System.out.println(triangleNumber(arr));
    }
    public static int triangleNumber(int[] arr) {
        Arrays.sort(arr);
        int cou=0;
        
        for(int i=arr.length-1;i>=0;i--){
            int start=0;
            int end=i-1;
           while(start<end ){
               int sum=arr[start]+arr[end];
               if(sum>arr[i]){
                   cou+=end-start;
                   end--;
               }
               else{
                   start++;
               }
           }
        }
        return cou;
    }
}
