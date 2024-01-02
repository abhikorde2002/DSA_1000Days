package Linked_List.Quesions;

public class Insert_Node {
    
    private Node head;
    private Node taile;
    private int size;
    public Insert_Node(){
        this.size=0;
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
    public void insert(int index,int val){
        if(index==0){
            insetFirst(val);
            return;
        }
        if(index==size){
            inserLast(val);
            return;
        }
        Node node= head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        Node tem=new Node(val, node.next);
        node.next=tem;
        size++;
    }

    public void inserLast(int val){
        Node node = new Node(val);
        if(taile==null){
            insetFirst(val);
        }
        taile.next=node;
        taile=node;
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
