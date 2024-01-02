package Linked_List.Quesions;

import Linked_List.Quesions.Middle_LinkedList.ListNode;

public class Life_Cycle2 {
    // class ListNode {
    //          int val;
    //          ListNode next;
    //          ListNode(int x) {
    //              val = x;
    //              next = null;
    //          }
    //      }
         public static class ListNode {
            // Data stored in the node
            public int data;
            // Reference to the next node
            //in the list (forward direction)
            public ListNode next;
            // Reference to the previous nod
            //in the list (backward direction)
            public ListNode back;
    
            // Constructor for a Node with both data, 
            //a reference to the next node, and a
            //reference to the previous node
            public ListNode(int data1, ListNode next1, ListNode back1) {
                data = data1;
                next = next1;
                back = back1;
            }
    
            // Constructor for a Node with data,
            //and no references to the next and
            //previous nodes (end of the list)
            public ListNode(int data1) {
                data = data1;
                next = null;
                back = null;
            }
        }
        private static ListNode Coneverting(int arr[]){
            ListNode head=new ListNode(arr[0]);
            ListNode prev=head;
 
            for(int i=1;i<arr.length;i++){
              ListNode tem= new ListNode(arr[i], null, prev);
              prev.next=tem;
        
              prev=tem; 
 }   
            return head;
  }       

     public static ListNode detectCycle(ListNode head) {
        ListNode node= head;
        ListNode fast= head;

        int len=0;
        //find length
        while(fast !=null && fast.next!= null){
            fast=fast.next.next;
            node=node.next;
             if(fast==node){
                len=lengthCycle(node);
                break;
             }
        }
        if(len==0){
            return null;
        }
        //find start
        ListNode f=head;
        ListNode s=head;
        while(len>0){
            s=s.next;
            len--;
        }

        //keep moving 
        while(f!=s){
            f=f.next;
            s=s.next;
        }
        return s;
        
    }
     public static int lengthCycle(ListNode head){
         ListNode node= head;
        ListNode fast= head;
        while(fast !=null && fast.next!= null){
            fast=fast.next.next;
             if(fast==node){
                 ListNode start=node;
                 int len=0;
                 do{
                    start=start.next;
                    len++;

                 }
                 while(start!=node);
                 return len;
             }
                 node=node.next;
        }
        return 0;
    }
    private static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " "); // Print the data in the current node
            head = head.next; // Move to the next node
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,5,6};
        ListNode head=Coneverting(arr);
        print(head);

        head=detectCycle(head);
        print(head);

    }
}
