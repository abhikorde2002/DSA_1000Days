package Linked_List.Starting;

public class Inserting_Node {
    private Node head;
    private Node taile;
    private int size;
    public Inserting_Node(){
        this.size=0;
    }
    public int len(Node head){
        Node node= head;
        int len=0;
        while (node!=null) {
            node= node.next;
            len++;
        }
        return len;
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
    public void inserFirst(int value){
        Node node= new Node(value);
        node.next= head;
        head=node;
        if(taile==null){
            taile=head;
        }

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
     public int DeleteLast(){
        if(size <=1){
            DeleteFirst();
        }
        Node secode= get(size-2);
        int value = taile.value;
        taile=secode;
        taile.next= null;
        return value;

     }
     public Node get(int index){
             Node node= head;
        for(int i=0;i<index;i++){
             node=node.next;
        }
          return node;
     }
     public int delet(int index){
        if(index==0){
            DeleteFirst();
        }
        if(index==size-1){
            DeleteLast();
        }
        Node prev = get(index-1);
        int value= prev.next.value;
        prev.next= prev.next.next;
        return value;
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
