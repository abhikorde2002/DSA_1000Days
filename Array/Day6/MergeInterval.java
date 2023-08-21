package Array.Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
    public static void main(String[] args) {
        int arr[][]={{1,3},{2,6},{8,10},{15,18}};
    //    merge(arr);
       
    }
     public static int[][] merge(int[][] arr) {
         Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        
       List <int[]> Output_arr= new ArrayList();
       int []current_interval=arr[0];
       Output_arr.add(current_interval);

       for(int []interval:arr){
           int current_begin=current_interval[0];
           int current_end= current_interval[1];
           int next=interval[0];
           int next_end= interval[1];

           if(current_end >= next){
               current_interval[1]=Math.max(current_end,next_end);
           }
           else{
               current_interval=interval;
               Output_arr.add(current_interval);
           }
       }
       for(int[] a:Output_arr){
         System.out.println(Arrays.toString(a));  
       }
       return Output_arr.toArray(new int[Output_arr.size()][]);
       }

      
}
