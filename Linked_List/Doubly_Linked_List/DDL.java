package Linked_List.Doubly_Linked_List;

public class DDL {
     
    Node head;
    public void inserFirst(int value){
     Node node= new Node(value);
     node.next= head;
     node.previous=null;
     if(head!=null){
       head.previous=node;
     }
     head=node;
    }
    public Node find(int value){
        Node node= head;
        while (node!=null) {
             if(node.value == value){
                return node;
             }
             node=node.next;
        }
        return null;
    }
    public void insert(int after ,int value){
        Node p= find(after);

        if(p==null) { System.out.println("Doesn't Exist");
        return ; 
        }

         Node node= new Node(value);
         node.next= p.next;
         p.next=node;
         node.previous= p;
         if(node.next!= null){
            node.next.previous=node;
         }
       System.out.println();
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

    public void insetlast(int value){
        Node node= new Node(value);
        Node  last= head;

        if(head== null){
            node.previous=null;
            head = node;
            return;
        }

        while (last.next!=null) {
            last=last.next;
        }
        last.next= node;
        node.previous=last;
    }
    public int DeleteLast(){
        Node node= head;
        while (node.next!=null) {
            node= node.next;
        }
           int val=node.value;
        node.previous.next=null;
      return val;
    }
    public int DeleteFirst(){
        int val= head.value;
        head=head.next;
        head.previous=null;
        return val;

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
