package Linked_List.Quesions;

public class Delet_Nodes {
    private Node head;
    private Node taile;
    private int size;
    public Delet_Nodes(){
        this.size=0;
    }
    public void inserFirst(int val){
         Node node = new Node(val);
         node.next= head;
         head= node;
         if(taile==null){
            taile=head;
         }
         size+=1;
    }
    public void display(){
        Node node= head;
        while (node!=null) {
            System.out.print(node.value + " -> ");
            node= node.next;
        }
        System.out.println("End");
    }

    public int DeleteFirst(){
        Node node=head;
        int value=head.value;
        if(head==null){
            taile=null;
        }
        head= node.next;
        size--;
        return value;
    }
    public Node get(int index){
        Node node= head;
        for(int i=0;i<index;i++){
            node= node.next;
        }
        return node;
    }

    public int DeleteLast(){
        if(size<=1){
            DeleteFirst();
        }
        int val=taile.value;
        Node sec=get(size-2);
        taile=sec;
        taile.next= null;
        return val;
    }
    public int delet(int index){
        if(index == 0){
            DeleteFirst();
        }
        if(index==size){
            DeleteLast();
        }

        Node curr= get(index-1);
        int val=curr.next.value;
        curr.next=curr.next.next;
        return val;
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
