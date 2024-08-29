package Greed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Interval {
   public static void main(String[] args) {
    int arr[][]={{1,3},{2,6},{8,10},{15,18}};
    System.out.println(Arrays.toString(merge(arr)));
   }
   
   static int[][] merge(int[][] num) {
    List<int[]> list= new ArrayList<>();
    Arrays.sort(num, (a,b) -> a[0]-b[0]);
int ind=0;
    int []curr_interval=num[0];
    list.add(curr_interval);
    for(int interval[]:num){
     int begin=curr_interval[0];
     int end=curr_interval[1];
     int next=interval[0];
     int next_end=interval[1];

     if(end>= next){
         curr_interval[1]=Math.max(end,next_end);
     }
     else{
        System.out.println(curr_interval[0]+""+curr_interval[1]);
        curr_interval=interval;
        System.out.println(curr_interval[0]+""+curr_interval[1]);
        list.add(curr_interval);
        System.out.println(Arrays.toString(list.get(ind++)));
     }

    }
return list.toArray(new int[list.size()][]);
 }
}
