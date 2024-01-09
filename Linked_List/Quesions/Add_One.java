package Linked_List.Quesions;

import java.util.Arrays;

public class Add_One {
    public Node head;
    public Node taile;
    public int size;
    public Add_One(){
        this.size=0;
    }
    public static void main(String[] args) {
        Add_One a= new Add_One();
        a.inserFirst(5);
        a.inserFirst(4);
        a.inserFirst(3);
        a.inserFirst(2);
        a.inserFirst(1);
        
       
        
    }
    public static Node reverseList(Node head) {
        Node prev=null;
        Node node =head;
        
        while(node!=null){
            Node next= node.next;
            node.next=prev;
            prev=node;
            node = next;
        }
        return prev;
    }

    public  Node addNode(Node head) {
		// Write your code here.   
       head=reverseList(head);
	   int carry=1;
	   Node node = head;
	   while (node!=null) {
		   node.value=node.value+carry;
		   if(node.value <10){
			   carry=0;
			   break;
		   }
		   else{
			   node.value=0;
			   carry=1;
		   }
		   node=node.next;
	   }
	   if(carry==1){
        
		   Node n= new Node(1);
		   head= reverseList(head);
		   n.next=head;
		   return n;
	   }

	   head= reverseList(head);
	   return head;
	}
      public void display(){
        Node tem=head;
        while (tem != null) {
            System.out.print(tem.value + " -> ");
            tem=tem.next;
        }
        System.out.println("End");
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
    class Node {
        private int value;
        private Node next;
   
        private Node(int value){
            this.value=value;
        }
        private Node (int value, Node next){
            this.value=value;
            this.next=next;
        }
        
    }
}
