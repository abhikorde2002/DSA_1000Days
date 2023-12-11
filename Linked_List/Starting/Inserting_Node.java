package Linked_List.Starting;

public class Inserting_Node {
    private Node head;
    private Node taile;
    private int size;
    public Inserting_Node(){
        this.size=0;
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
    

    public void insert(int value,int index){
        if(index == 0){
            inserFirst(value);
            return;
        }
        if(index==size){
            inserLast(value);
            return;
        }
        Node tem= head;
        for(int i=1;i<index;i++){
            tem=tem.next;
        }
        Node node = new Node(value, tem.next);
        tem.next= node;
        size+=1;
    }
    public void inserLast(int value){
        Node node = new Node(value);
        if(taile==null){
            inserFirst(value);
        }
        taile.next=node;
        taile=node;
       
        size+=1;
    }
    public void display(){
        Node tem=head;
        while (tem != null) {
            System.out.print(tem.value + " -> ");
            tem=tem.next;
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
