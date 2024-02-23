package Linked_List.Quesions;

public class Remove_Nth {
    public static void main(String[] args) {
        Remove_Nth r= new Remove_Nth();
        int arr[]= {1,2,3,4,5};
        ListNode head=Coneverting(arr);
        print(head);
        removeNthFromEnd(head, 2);
        print(head);
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode back;
        ListNode() {}
        ListNode(int val) { this.val = val; next=null; back=null;}
        public ListNode(int val1, ListNode next1, ListNode back1) {
           val = val1;
           next = next1;
           back= back1;
       }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    private static  ListNode Coneverting(int arr[]){
        ListNode head=new ListNode(arr[0]);
        ListNode prev=head;

        for(int i=1;i<arr.length;i++){
          ListNode tem= new ListNode(arr[i], null, prev);
          prev.next=tem;
    
          prev=tem; 
}   
        return head;
} 
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null|| head.next==null)return null ;
        ListNode fast= head;
        ListNode slow=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
            if(fast==null){
                return head.next;
            }
        }
        while(fast.next !=null ){
            fast=fast.next;
            slow=slow.next;
        }
         slow.next=slow.next.next;
         return head;
    }
    private static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " "); // Print the data in the current node
            head = head.next; // Move to the next node
        }
        System.out.println();
    }
    // public static void display(ListNode head){
    //     ListNode node= head;
    //     while (node!=null) {
    //         System.out.print(node.val + " -> ");
    //         node= node.next;
    //     }
    //     System.out.println("End");
    // }
   
}
