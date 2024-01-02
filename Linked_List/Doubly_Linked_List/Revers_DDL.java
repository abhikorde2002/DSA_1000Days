package Linked_List.Doubly_Linked_List;

public class Revers_DDL {
    public static class Node {
        // Data stored in the node
        public int data;
        // Reference to the next node
        //in the list (forward direction)
        public Node next;
        // Reference to the previous nod
        //in the list (backward direction)
        public Node back;

        // Constructor for a Node with both data, 
        //a reference to the next node, and a
        //reference to the previous node
        public Node(int data1, Node next1, Node back1) {
            data = data1;
            next = next1;
            back = back1;
        }

        // Constructor for a Node with data,
        //and no references to the next and
        //previous nodes (end of the list)
        public Node(int data1) {
            data = data1;
            next = null;
            back = null;
        }
    }

    private static Node Coneverting(int arr[]){
           Node head=new Node(arr[0]);
           Node prev=head;

           for(int i=1;i<arr.length;i++){
             Node tem= new Node(arr[i], null, prev);
             prev.next=tem;
       
             prev=tem; 
}   
           return head;
 }

    private static Node Revers(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node prev=null;
        Node curr=head;

        while (curr!=null) {
            prev=curr.back;
            curr.back=curr.next;

            curr.next=prev;
            curr=curr.back;
        }
        return prev.back;
    }
    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " "); // Print the data in the current node
            head = head.next; // Move to the next node
        }
        System.out.println();
    }
   

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Node head=Coneverting(arr);
        print(head);
       System.out.println("Doubly Linked List after Swaping previous node to next pointers: ");
        head=Revers(head);
        print(head);
    }
        
}
