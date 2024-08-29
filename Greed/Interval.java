package Greed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Interval {
    public static void main(String[] args) {
        int arr[][]={{1,3},{6,9}};
        int newInterval[]={2,5};
        System.out.println(Arrays.toString(insert(arr,newInterval )));
    }

   static int[][] insert(int arr[][],int newInterval[]){
     List<int[]> s= new ArrayList<>();
     int i=0;
    
     while (i<arr.length && arr[i][1]<newInterval[0]) {
        s.add(arr[i]);
        i++;
     }
     while (i<arr.length && arr[i][0]<=newInterval[1]) {
        newInterval[0]=Math.min(arr[i][0], newInterval[0]);
        newInterval[1]=Math.max(arr[i][1], newInterval[1]);
        i++;
     }

     while (i<arr.length) {
        s.add(arr[i]);
        i++;
     }
     return s.toArray(new int[s.size()][]);
   }
}
