package Heap.Max;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Subseq_k {
    public static void main(String[] args) {
        int arr[]={2,1,3,3};
        System.out.println(Arrays.toString(maxSubsequence(arr, 2)));
    }

    public static int[] maxSubsequence(int[] arr, int k) {
        if(arr.length==k){
            return arr;
        }
         int sum[]=new int[k];
        List<Integer> str= new ArrayList<>();
        int a=0;
        int num[]=arr;
        Arrays.sort(num);
        for(int i=num.length-1;i>=num.length-k;i--){
           str.add(num[i]);
        }
        System.out.println(str);
        for (int i = 0; i < str.size(); i++) {
           if (str.contains(arr[i])) {
             sum[a++]=str.get(i);
           }
        }
        return sum;
    }
}
