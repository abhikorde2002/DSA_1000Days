package Linked_List.Quesions;

public class Palindrom {
    public Node head;
    public int size;
    public Node taile;
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
    public static void main(String[] args) {
        int arr[]={1,2,2,1};
        Node head=Coneverting(arr);
        print(head);
        System.out.println(IsPalindrome(head));
    }

    public static boolean IsPalindrome(Node head){
        Node prev= null;
        Node node= head;
        while(node!=null){
            Node tem= new Node (node.data);
            tem.next=prev;
            prev=tem;
            node= node.next;
        } 
        while(head!=null && prev!=null){
            if(head.data!=prev.data){
                return false;
            }
            head=head.next;
            prev=prev.next;
        }
        return true; 
    }
    public void inserFirst(int value){
        Node node= new Node(value);
        node.next= head;
        head=node;
        if(taile==null){
            taile=head;
        }

        size+=1;
    }
    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " "); // Print the data in the current node
            head = head.next; // Move to the next node
        }
        System.out.println();
    }
    public void display(){
        Node tem=head;
        while (tem != null) {
            System.out.print(tem.data + " -> ");
            tem=tem.next;
        }
        System.out.println("End");
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
}

