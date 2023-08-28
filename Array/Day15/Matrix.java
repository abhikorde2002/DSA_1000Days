package Array.Day15;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
       int num[][]={{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
       System.out.println(Arrays.toString(search(num, 34)));
       System.out.println(search(num, 37)); 
    }

    static int[] search(int num[][],int target){
        int start=0;
        int end=num.length-1;
        while(start<num.length && end>=0){
            if(num[start][end]==target){
                return new int[]{start,end};
            }
            else if(num[start][end]>target){
                end--;
            }
            else{
                start++;
            }
        }
        return new int[]{-1,-1};
    }
}
