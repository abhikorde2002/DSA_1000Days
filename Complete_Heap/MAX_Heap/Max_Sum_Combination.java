package Complete_Heap.MAX_Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Max_Sum_Combination {
    public static void main(String[] args) {
        int arr[]={1, 4, 2, 3};
        int num[]={2, 5, 1, 6};
        System.out.println(Arrays.toString(combination_Sum(arr, num, 4)));
        String s="";
        String str[]={"null", "null", "null", "null", "null", "null", "null"," BG 2326 HF"};
        for (int i=0;i<str.length;i++) {
           String words=str[i];
           if(!words.equals("null")){
            for(int j=0;j<words.length();j++){
               if (words.charAt(j)!=' ') {
                s+=words.charAt(j);
               }
            }
           }
        }
        System.out.println(s);
    }

    static int[] combination_Sum(int arr[],int num[],int k){
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b) -> a-b);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < num.length; j++) {
                int sum=arr[i]+num[j];
              
                pq.offer(sum);
                if(pq.size()>k){
                    pq.poll();
                }
            }
        }
        int sum[]=new int[k];
        int ind=k-1;
        while (!pq.isEmpty()) {
            sum[ind--]=pq.poll();
        }
        return sum;
    }
}
