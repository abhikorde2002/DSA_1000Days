package Array.Advance_Array;

import java.util.ArrayList;

public class Maximum_Sub {
    public static void main(String[] args) {
        int arr[]={8, 5, 10, 7 ,9 ,4 ,15, 12, 90, 13};
        System.out.println(max_of_subarrays(arr, 9, 3));
    }
      static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList <Integer> str = new ArrayList<>();
        int a=0;
        int max=0;
        for(int i=0;i<arr.length-k+1;i++){
            a=i;
            int cou=0;
            while(a<=arr.length-1 && cou<k){
                max= Math.max(arr[a++],max);
                cou++;
            }
            str.add(max);
            max=0;
        }
        return str;
    }
}
