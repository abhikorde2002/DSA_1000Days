package Array.Day_24;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int arr[]={1,4,3,5,6,2};
        System.out.println(Arrays.toString(search(arr)));
    }

    static int[] search(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                }
            }
        }
        return arr;
    }
}
