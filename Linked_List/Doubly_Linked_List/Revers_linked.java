package Linked_List.Doubly_Linked_List;

import java.util.Scanner;

public class Revers_linked {
    public static class  Node {
      public int data;
    public Node next;
    public Node back;
    public Node(int data,Node next,Node back){
        this.data=data;
        this.next=next;
        this.back=back;
    }

    public Node(int data){
        this.data=data;
    }
        
    }

    private static Node convertArrtNode(int arr[]){
        Node head= new Node(arr[0]);
        Node prev=head;

        for(int i=1;i<arr.length;i++){
            Node tem=new Node(arr[i],null,prev);
            prev.next=tem;
            prev=tem;
        }
        return head;
    }
    
    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " "); // Print the data in the current node
            head = head.next; // Move to the next node
        }
        System.out.println();
    }
    public static Node Display(Node head){
        Node node= head;
        Node last=null;
        while (node!=null) {
            last=node;
            node=node.next;
        }
        while (last!=null) {
             System.out.print(last.data);
            if(last.back!=null){
           System.out.print(" "+"-> ");
            }
            last=last.back;
            
        }
        return last;
    }

  
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // double d= sc.nextDouble();

       
        int[] arr = {12, 5, 6, 8};
        Node head = convertArrtNode(arr); // Convert the array to a doubly linked list
        print(head); // Print the doubly linked list
        
        System.out.println("Doubly Linked List after Revers Linked List: ");
        head=Display(head);
        print(head);
    }
    
}
