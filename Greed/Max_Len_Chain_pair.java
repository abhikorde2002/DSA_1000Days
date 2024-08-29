package Greed;

import java.util.Arrays;

public class Max_Len_Chain_pair {
    public static void main(String[] args) {
        int arr[][]={{1,2},{7,8},{4,5}};
     System.out.println(findLongestChain(arr));
     logic(arr);
    }
    static void logic(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i][0]>arr[j][0]){
                    int tem=arr[i][0];
                    arr[i][0]=arr[j][0];
                    arr[j][0]=tem;
                    int val=arr[i][1];
                    arr[i][1]=arr[j][1];
                    arr[j][1]=val;
                }
            }
        }
        int cou=1;
        for (int i = 0; i < arr.length; i++) {
            int ind=i+1;
            while (ind!=arr.length) {
                if(arr[i][1]<arr[ind++][0]){
                   cou++;
                   break;
                }
            }
        }
       System.out.println(cou);
    }

    public static int findLongestChain(int[][] arr) {
        int cou=1;
        
        
        for (int i = 0; i < arr.length; i++) {
            int ind=1;
            while (ind!=arr.length) {
                if(arr[i][1]<arr[ind++][0]){
                   cou++;
                   break;
                }
            }
        }
        return cou;
    }
}
