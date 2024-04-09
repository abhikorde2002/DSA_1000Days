package Stack_Queue;

import java.util.Arrays;

public class Trapping_Ran {
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }

    public static int trap(int[] num) {
        int n = num.length;

       // Calculate left max bondary array

       int left_boundary[] = new int[n];
       left_boundary[0] = num[0];

       for (int i = 1; i < n; i++) {
           left_boundary[i] = Math.max(left_boundary[i - 1], num[i]);
       }

       // Calculate right max bondary array
       int right_max[] = new int[n];
       right_max[n - 1] = num[n - 1];

       for (int i = n - 2; i >= 0; i--) {
           right_max[i] = Math.max(num[i], right_max[i + 1]);
       }
       int trappede = 0;
       System.out.println(Arrays.toString(left_boundary));
       System.out.println(Arrays.toString(right_max));
       // loop
       for (int i = 0; i < n; i++) {
           int water = Math.min(left_boundary[i], right_max[i]);
           System.out.println("Water:- "+water);
           trappede += water - num[i];
          System.out.println("Tranppede:- "+trappede);
        }

       return trappede;
   }
}
