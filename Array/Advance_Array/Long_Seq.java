package Array.Advance_Array;

import java.util.HashSet;

public class Long_Seq {
    public static void main(String[] args) {
        int arr[]={100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }

    public static int longestConsecutive(int[] arr) {
     if(arr.length==0){return 0;}
     HashSet<Integer> set = new HashSet<>();
     for(int n:arr){
         set.add(n);
     }
     int cou=0;
     int max=0;
     int n=0;
     for(int i=0;i<arr.length;i++){
      n=arr[i];
      cou=0;
      if(!set.contains(n-1)){
          cou=1;
        while(set.contains(n+1)){
            cou++;
            n++;
        }
      }
      max= Math.max(cou,max);
     }
     return max;
    }
}
