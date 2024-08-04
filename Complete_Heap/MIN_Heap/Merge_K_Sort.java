package Complete_Heap.MIN_Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Merge_K_Sort {
    public static void main(String[] args) {
     //  ListNode lists = {[1,4,5],[1,3,4],[2,6]}; 
       int arr[][]={{1,2,3,4},{2,2,3,4},{5,5,6,6},{7,8,9,9}};
       System.out.println(mergeKArrays(arr, 3));
     //  System.out.println(mergeKLists(arr));
    }
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            int[] ls=arr[i];
            int ind=0;
            while (ind!=ls.length) {
                pq.offer(ls[ind++]);
            }

        }
ArrayList<Integer> list= new ArrayList<>();
        while (!pq.isEmpty()) {
            list.add(pq.poll());
        }
        return list;
        
    }

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> s= new PriorityQueue<>((a,b) -> a.val-b.val);
        for(int i=0;i<lists.length;i++){
        
           ListNode node=lists[i];
           while(node!=null){
           s.offer(node);
           node=node.next;
           }
         
        }
        ListNode node=s.poll();
        ListNode ans=node;
        while(!s.isEmpty()){
          ans.next=s.poll();
         ans= ans.next;
        }
        if(ans!=null){
         ans.next=null;
        }
        return node;
     }
}
 class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
