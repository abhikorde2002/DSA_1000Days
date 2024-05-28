package Heap.Max;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Find_Subseq_k {
    public static void main(String[] args) {
        int arr[]={2,1,3,3};
        System.out.println(Arrays.toString(maxSubsequence(arr, 2)));
    }

    public static int[] maxSubsequence(int[] arr, int k) {
      PriorityQueue<int[]> map= new PriorityQueue<>((a,b)-> b[0]-a[0]);
      for(int i=0;i<arr.length;i++){
           map.offer(new int[]{arr[i],i});
      }
      
      List<int[]> list= new ArrayList<>();
      while(k-- !=0){
        list.add(map.poll());
      }
      Collections.sort(list,(a,b) -> a[1] -b[1]);
      int res[]= new int[list.size()];
       System.out.println(list);
      int ind=0;
      for(int []num:list){
        res[ind++]=num[0];
      }
      return res;
    }
    public int[] maxSub(int[] arr, int k) {
        PriorityQueue<Integer> map= new PriorityQueue<>();
        for(Integer i:arr){
             map.offer(i);
             if(map.size()>k) map.poll();
        }
        int res[]= new int[k];
        int ind=0;
        for(Integer i:arr){
            if(map.contains(i)){
              res[ind++]=i;
              map.remove(i);
              if(map.size()==0)break;
            }   
        }
        return res;
      }
}
