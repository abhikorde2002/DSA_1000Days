package Linked_List.Starting;

public class Study {
    
    private Node head;
    private Node tail;
    private int size;
    public Study(){
        this.size=0;
    }

    public void insetFirst(int value){
        Node node = new Node(value);
        node.next= head;
        head= node;
        if(tail==null){
            tail=head;
        }
      size+=1;
    }

    public void inserLast(int value){
        Node node = new Node(value);
        if(tail == null){
            insetFirst(value);
        }
        tail.next= node;
        tail= node;
        size++;
   
    }

    public void insert(int value,int index){
        if(index==0){
            insetFirst(value);
            return;
        }
        if(index==size){
            inserLast(value);
        }
        Node node= head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
       Node tem= new Node(value, node.next);
       node.next=node;
       size+=1;
       System.out.println(size);
    }

    public int DeleteFirst(){
        int val= head.value;
        head= head.next;
        if(head==null){
            tail= null;
        }
        size--;
        return val;
    }


    public void Display(){
        Node node= head;
        while (node!=null) {
            System.out.print(node.value + " -> ");
            node= node.next;
        }
        System.out.println("End");
    }

    private class  Node {
      private int value;
      private Node next;

      public Node(int value){
        this.value= value;
      }
      public Node(int value,Node next){
        this.value=value;
        this.next = next;
      }
        
    }
}
