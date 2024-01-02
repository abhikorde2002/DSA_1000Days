package Linked_List.Quesions;

public class Revers_Linked {
    private Node head;
    private Node taile;
    private int size;
    public Revers_Linked(){
        this.size=size;
    }
    public static void main(String[] args) {
        Revers_Linked r= new Revers_Linked();
        r.inserFirst(5);
        r.inserFirst(4);
        r.inserFirst(3);
        r.inserFirst(2);
         r.inserFirst(1);
        r.display();
        r.delet(2);
        r.display();
        Node head=r.reverseList();
        r.print(head);
    }
    public  void inserFirst(int value){
        Node node= new Node(value);
        node.next= head;
        head=node;
        if(taile==null){
            taile=head;
        }

        size+=1;
    }
    public int DeleteFirst(){
        int value= head.value;
        head= head.next;
        if(head==null){
            taile=null;
        }
        size--;
        System.out.println(size);
        return value;
     }
     private static void print(Node head) {
        while (head != null) {
            System.out.print(head.value + " "); // Print the data in the current node
            head = head.next; // Move to the next node
        }
        System.out.println();
    }
    public int delet(int index){
        if(index==0){
            DeleteFirst();
        }
        Node node= reverseList();
        for(int i=0;i<index;i++){
            node=node.next;
        }
        Node prev= node;
        int value= prev.next.value;
        prev.next=prev.next.next;
        return value;
    }
    public Node reverseList( ) {
         Node  prev=null;
         Node  node =head;
        
        while(node!=null){
             Node  next= node.next;
            node.next=prev;
            prev=node;
            node = next;
        }
        return prev;
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
