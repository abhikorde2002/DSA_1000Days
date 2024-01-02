package Linked_List.Quesions;

import org.w3c.dom.Node;

public class length {
     private Node head;
    private Node taile;
    private int size;
    public length(){
        this.size=0;
    }
    public void Sizes(){
        Node node= head;
        int val=0;
        while (node!=null) {
            node=node.next;
            val+=1;
        }
       System.out.println("Size of Linked List is : -" + val);
    }
    public void insetFirst(int val){
        Node node = new Node(val);
        node.next= head;
        head=node;
        if(taile==null){
            taile= head;
        }
        
        size++;

    }
    public void display(){
        Node node= head;
        while (node!=null) {
            System.out.print(node.value + " -> ");
            node= node.next;
        }
        System.out.println("End");
    }

    private class Node{
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
