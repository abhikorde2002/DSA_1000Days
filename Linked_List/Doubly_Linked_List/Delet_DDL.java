package Linked_List.Doubly_Linked_List;

public class Delet_DDL {
    
    Node head;
    
    public int DeleteLast(){
        if(head==null || head.next==null){
            return 0;
        }
        Node node= head;
        while (node.next!=null) {
            node= node.next;
        }
           int val=node.value;
        node.previous.next=null;
      return val;
    }

    public int DeleteFirst(){
          if(head==null || head.next==null){
            return 0;
        }
        int val= head.value;
        head=head.next;
        head.previous=null;
        return val;

    }
    
    public void inserFirst(int value){
        Node node= new Node(value);
        node.next= head;
        node.previous=null;
        if(head!=null){
          head.previous=node;
        }
        head=node;
       }

    public void Display(){
        Node last=null;
        Node node= head;
        while (node!=null) {
            System.out.print(node.value+ " -> ");
            last=node;
            node=node.next;
        }
         System.out.println();
         System.out.println("Printing Rev");
         while (last!=null) {
            System.out.print(last.value+ " -> ");
            last=last.previous;
         }
         System.out.println();

    }

    private class Node {
        int value;
        Node next;
        Node previous;
   
        public Node(int value){
           this.value= value;
        }
   
        public Node(int value,Node next, Node previous){
           this.value=value;
           this.next=next;
           this.previous= previous;
        }
           
       }  
}
