package Heap.Max;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Merge_Ksorted {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(merge(arr, 3));
    }
    static ArrayList <Integer> merge(int arr[][],int K){
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->(a[0]-b[0]));

        for(int i=0;i<K;i++)
        
        pq.offer(new int[]{arr[i][0],i,0});
        
        ArrayList<Integer>ans=new ArrayList<>();
        
        while(!pq.isEmpty()){
        
        int[]temp=pq.poll();
       // System.out.println(Arrays.toString(temp));
        int ele=temp[0],row=temp[1],col=temp[2];
        System.out.println(row);
        System.out.println(col);
        ans.add(ele);
        System.out.println(ans);
        if(col+1<K) pq.offer(new int[]{arr[row][col+1],row,col+1});
        
        }
        
        return ans;
    }
}
