package LeetCode_Contest.Array;

import java.util.Arrays;

public class Battery_COu {
    public static void main(String[] args) {
        int arr[]={0,1,2};
        System.out.println(isBattery(arr));
    }

    static int isBattery(int arr[]){
        int cou=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]>0){
                if( arr[j]!=0){
                   arr[j]=Math.max(0, arr[j] - 1);
                   int a=arr[j];
                }
                System.out.println( j+ "" +Arrays.toString(arr));
            }     
            else{
                continue;
            }
        }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                cou++;
            }
        }
        return cou;
    }
}
