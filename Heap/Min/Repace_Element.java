package Heap.Min;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Repace_Element {
    public static void main(String[] args) {
        int arr[]={2, 2, 1, 6};
        System.out.println(Arrays.toString(replaceWithRank(arr,arr.length)));
    }
 static int[] replaceWithRank(int arr[], int N) {
     // code here
       int num[]=Arrays.copyOf(arr, arr.length);
        Arrays.sort(num);
       Map<Integer,Integer> map= new HashMap<>();
       int ind=1;
       for(int i=0;i<num.length;i++){
           if(map.containsKey(num[i])){
              continue;
           }
           else{
            map.put(num[i], ind++);
           }
       }
       int a[]= new int[arr.length];
       int b=0;
       for (int i = 0; i < arr.length; i++) {
        if(map.containsKey(arr[i])){
            a[b++]=map.get(arr[i]);
        }
       }
       return a;
  }
    static int[] replaceElement(int arr[]){
        int num[]=Arrays.copyOf(arr, arr.length);
        Arrays.sort(num);
        int ind=0;
        int a[]= new int[arr.length];
      
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if(arr[i]==num[j]){
                    a[ind++]=j+1;
                    break;
                }
            }
        }
      
        return a;
    }
}
