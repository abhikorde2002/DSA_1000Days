package Array.Day_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Duplicate_Number {
    public static void main(String[] args) {
        int arr[]={1,3,4,2,2};
      //  System.out.println(findDuplicate(arr));
        int a[]={1 ,2 ,2 ,1};
        System.out.println(Arrays.toString(intersection(arr, a)));
        
    }

    public static int findDuplicate(int[] arr) {
        int start=1;
        int end=arr.length-1;
        while(start<=end){
            int mid=start + (end-start)/2;
            int count=0;
            for(int i:arr){
                if(i<=mid){
                ++count;
                }
            }
            if(count<=mid){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return start;
     }
      
    public static int[] intersection(int[] arr, int[] arr1) {
        // write your code here
        int start=0;
      
        HashSet<Integer> str= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            str.add(arr[i]);
        }
        ArrayList<Integer>  st= new ArrayList<>();
      
        for(int i=0;i<arr1.length;i++){
            if(str.contains(arr1[i])){
                str.remove(arr1[i]);
                st.add(arr1[i]);          
            }     
        }
          int num[]=new int[st.size()];
        for(int i:st){
            num[start++]=i;
        }  
        return num;
    }
}
