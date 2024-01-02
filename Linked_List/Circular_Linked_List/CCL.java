package Linked_List.Circular_Linked_List;

public class CCL {
   private Node head;
   private Node tail;
    
   public CCL(){
     this.head=null;
     this.tail=null;
   }

   public void inser(int value){
    Node node= new Node(value);
    if(head==null){
        head=node;
        tail=node;
        return;
    }
    tail.next=node;
    node.next=head;
    tail=node;
   }

   public void delet(int value){
      Node node = head;
      if(node==null){
        return;
      }
      if(node.value==value){
           head= head.next;
           tail=head;
           return;
      }

      do{
        Node n=node.next;
        if(n.value==value){
            node.next=n.next;
            break;
        }
        node=node.next;
      }
      while(node!=null);
   }
   public void display(){
    Node node = head;
    if(head!=null){
        do{
            System.out.print(node.value+ " ->");
            node= node.next;
        }
        while(node!=head);
    }
    System.out.println(" Head ");
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
