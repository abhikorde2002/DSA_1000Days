package Greed;

import java.util.Arrays;

public class Array_Partision {
    public static void main(String[] args) {
        int arr[]={6,2,6,5,1,2};
        System.out.println(arrayPairSum(arr));
    }

    static int arrayPairSum(int[] arr) {
        Arrays.sort(arr);
        int left=0;
        int sum=0;
        if(arr.length==1){
            return arr[0];
        }
        int right=1;
        while (left<arr.length && right<arr.length) {
            sum+=Math.min(arr[left], arr[right]);
            left=right+1;
            right=left+1;
        }
        return sum;
    }
}
