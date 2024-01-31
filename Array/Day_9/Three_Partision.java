package Array.Day_9;

import java.util.ArrayList;
import java.util.Arrays;

public class Three_Partision {
    public static void main(String[] args) {
     int A[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
     threeWayPartition(A, 10, 20, A.length);
    
    }
     public static void threeWayPartition(int arr[], int a, int b,int n)
    {   
        // Initialize ext available positions for
        // smaller (than range) and greater elements
        int start = 0, end = n - 1;
 
        // Traverse elements from left
        for (int i = 0; i <= end;) {
 
            // If current element is smaller than
            // range, put it on next available smaller
            // position.
  
            if (arr[i] < a) {
 
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
                i++;
            }
 
            // If current element is greater than
            // range, put it on next available greater
            // position.
            else if (arr[i] > b) {
 
                int temp = arr[end];
                arr[end] = arr[i];
                arr[i] = temp;
                end--;
            }
 
            else
                i++;      
        }
        System.out.println(Arrays.toString(arr));
    }
}

