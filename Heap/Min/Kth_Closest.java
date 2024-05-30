package Heap.Min;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Kth_Closest {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
       // System.out.println(findClosestElements(arr, 4, 3));
        System.out.println(findClosest(arr,4, 3));
    }
    public static List<Integer> findClosest(int[] arr, int k, int x) {
        PriorityQueue<Integer> s= new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
             if(k>0){
                 s.offer(arr[i]);
                 k--;
             }
             else if(Math.abs(s.peek()-x)>Math.abs(arr[i]-x)){
                  s.poll();
                  s.offer(arr[i]);
             }
         }
 
         List<Integer> str= new ArrayList<>();
          while(!s.isEmpty()){
             str.add(s.poll());
          }
 
         return str;
     }
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {

        // The sliding window is between 'mid' and 'mid' + k.
        int left = 0, right = arr.length - k;
        while (left < right) {
            int midpoint = left + (right - left) / 2; // same as (left + right) / 2

            // With midpoint on the left, we use x - arr[midpoint], while arr[midpoint + k] - x because it is on the right.
            // This is important!
            // Rather than using Math.abs(), we need the direction keep the x within the sliding window.
            // If the window is too far left, we shift the window to the right.
            if (x - arr[midpoint] > arr[midpoint + k] - x) {
                left = midpoint + 1;
            }
            // If the window is too far right, we shift the window to the left.
            else {
                right = midpoint;
            }
        }

        // Input all the k closest integers into the result.
        List<Integer> result = new ArrayList<>(k);
        for (int i = left; i < left + k; i++) {
            result.add(arr[i]);
        }
        return result;
    }
}
