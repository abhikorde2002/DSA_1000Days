package Array.Day_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class K_Small_Matrix {
    public static void main(String[] args) {
        int arr[][]={{1,5,9},{10,11,13},{12,13,15}};
        int i=0;
        int k=8;
        int num[]=new int[arr.length*arr.length];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                num[i++]=arr[row][col];
            }
        }
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println(num[k-1]);
    }
   
    
}
