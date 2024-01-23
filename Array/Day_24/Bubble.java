package Array.Day_24;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int arr[]={2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(search(arr)));
    }

    static int[] search(int arr[]){
        int cou=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                    cou++;
                }
            }
        }
        System.out.println(cou);
        return arr;
    }
}
