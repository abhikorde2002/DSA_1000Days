package Greed;

import java.util.Arrays;

public class Candy {
    public static void main(String[] args) {
        int arr[]={1,0,2};
        System.out.println(candy(arr));
    }
    public int candys(int[] arr) {
        int left[]=new int[arr.length];
       int right[]=new int[arr.length];
       int cou=2;
       left[0]=1;
       if (arr.length==1) {
           return 1;
       }
       for (int i = 1; i < arr.length; i++) {
           if(arr[i]>arr[i-1]){
              left[i]=cou++;
           }
           else{
               left[i]=1;
               cou=2;
           }
       }
     

       right[arr.length-1]=1;
       int val=2;
       for(int i=arr.length-2;i>=0;i--){
           if(arr[i]>arr[i+1]){
               right[i]=val++;
           }
           else{
               right[i]=1;
               val=2;
           }
       }
       int max=0;
       for(int i=0;i<arr.length;i++){
           int maxs=Math.max(left[i], right[i]);
           max+=maxs;
       }
       return max;
   }

    public static int candy(int[] arr) {
        int left[]=new int[arr.length];
       
        int cou=2;
        left[0]=1;
        if (arr.length==1) {
            return 1;
        }
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[i-1]){
               left[i]=cou++;
            }
            else{
                left[i]=1;
                cou=2;
            }
        }
        int val=2;
        int max=0;
        int ind=arr.length-1;
        max=Math.max(left[ind++], 1);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
             int maxs=Math.max(left[i], val++);
            max+=maxs;
            }
            else{
                int maxs=Math.max(left[i], 1);
            max+=maxs;
       
                val=2;
            }
        }
        // int max=0;
        // for(int i=0;i<arr.length;i++){
        //     int maxs=Math.max(left[i], right[i]);
        //     max+=maxs;
        // }
        return max;
    }
}
