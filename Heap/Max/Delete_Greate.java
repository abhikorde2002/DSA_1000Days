package Heap.Max;

import java.util.Arrays;

public class Delete_Greate {
    public static void main(String[] args) {
        int arr[][]={{1,2,4},{3,3,1}};
        System.out.println(Sort(arr));
    }
    static int Sort(int []arr[]){
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
          
        }
        int sum=0;
       for (int i = 0; i < arr[0].length; i++) {
        int max=-1;
        for (int j = 0; j < arr.length; j++) {
            max=Math.max(max, arr[j][i]);
        }
        sum+=max;
       }
        return sum;
    }
}
