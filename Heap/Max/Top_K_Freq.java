package Heap.Max;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class Top_K_Freq {
    public static void main(String[] args) {
       int arr[]={1,1,1,2,2,3};
       System.out.println(topKFrequent(arr, 2)); 
    }
    static  int[] topKFrequent(int[] arr, int k) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int c=k;
        PriorityQueue<Integer> str= new PriorityQueue<>((a,b)-> b-a);
        for (int i = 0; i < map.size(); i++) {
            str.offer(map.get(i));
        }
        System.out.println(str);
        // while (c-->0) {
            
        // }
        Set<Integer> s= new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.get(arr[i])>=k){
                s.add(arr[i]);
            }
        }
        Integer[] array = new Integer[s.size()];
       int num[]= new int[s.size()];
       
        s.toArray(array);
       int ind=0;
    
        for (int i : array) {
            num[ind++]=i;
        }
        return num;
    }
}
