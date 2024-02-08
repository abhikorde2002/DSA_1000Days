package Array.Day_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import Array.Day_22.Collection;

public class K_thsmallest {
    public static void main(String[] args) {
        int arr[][]={{1,5,9},{10,11,13},{12,13,15}};
        System.out.println(kthSmallest(arr, 8));
    }

     public static int kthSmallest(int[][] arr, int k) {
    int num[]=new int[arr.length*arr.length];
       int i=0;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++)
                num[i++]=arr[row][col];
        }
         Arrays.sort(num);
         int ans=num[k-1];
         return ans;
    }

    public static int kthSmallests(int[][] matrix, int k) {
        int n = matrix.length;
      int low = matrix[0][0];
      int high = matrix[n - 1][n - 1];
      
      while(low < high) {
        int mid = low + (high - low) / 2;
        int count = lessEqual(matrix, mid);
        
        if(count < k) low = mid + 1;
        else
          high = mid;
      }
      return low;
    }
  public static int lessEqual(int[][] matrix, int target) {
    int count = 0, len = matrix.length;
    int i = len - 1, j = 0;
    
    while(i >= 0 && j < len) {
      if(matrix[i][j] > target) i --;
      
      else{
        count = count + i + 1;
        j ++;
      }
      
    }
      return count;
  }
}
