package Array.Day_24;

import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
        int arr[]={4,2,3,1,5};
        System.out.println(Arrays.toString(Sort(arr)));
    }
    
    static int[] Sort(int arr[]){
       int i=0;
       while(i<arr.length){
        int index=arr[i]-1;
        System.out.println(index);
        if(arr[i]!=arr[index]){
            int tem=arr[i];
            arr[i]=arr[index];
            arr[index]=tem;
        }
        else{
            i++;
        }
       }
       return arr;
    }
}
