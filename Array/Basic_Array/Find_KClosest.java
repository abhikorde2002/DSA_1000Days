package Array.Basic_Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Find_KClosest {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(Arrays.toString(findClosestElements(arr, 4, 3)));
    }

    public static int[] findClosestElements(int[] arr, int k, int x) {
        // write your code here
        int cou=0;
        ArrayList<Integer>  str= new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(cou<k){
                str.add(arr[i]);
                cou++;
            }
        }
        int a[]=new int[str.size()];
        int start=0;
       for(int i:str){
            a[start++]=i;
       }
       return a;
    }
}
