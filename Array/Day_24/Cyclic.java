package Array.Day_24;

import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
        int arr[]={4,2,3,1,5};
        int num[]={4,5,6,7,0,2,1,3};
        
        String s= "codeleet";
        System.out.println(Arrays.toString(Sort(num)));

    }
    
    static int[] Sort(int arr[]){
       int i=1;
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
