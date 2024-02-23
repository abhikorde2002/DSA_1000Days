package Linked_List.Quesions;

public class Remove_Dul {
    private Node head;
    private Node taile;
    private int size;
    public static void main(String[] args) {
    //    Remove_Dul rem= new Remove_Dul();
    //    rem.inserLast(1);
    //    rem.inserLast(1);
    //    rem.inserLast(1);
    //    rem.inserLast(2);
    //    rem.inserLast(4);
    //    rem.inserLast(4);
    //    rem.display();
    //    rem.Sorted_linked();
    //    rem.display();
        Remove_Dul first= new Remove_Dul();
        Remove_Dul last= new Remove_Dul();
        first.inserLast(1);
        first.inserFirst(3);
        first.inserFirst(5);
        first.inserFirst(6);
       
    
       
        last.inserLast(1);
      last.inserFirst(1);
      last.inserFirst(2);
      last.inserFirst(3);


         Remove_Dul ans= Remove_Dul.merge(first, last);
         ans.display();
    }
     
    public void display(){
        Node tem=head;
        while (tem != null) {
            System.out.print(tem.value + " -> ");
            tem=tem.next;
        }
        System.out.println("End");
    }
    

    public static Remove_Dul merge(Remove_Dul first,Remove_Dul last){
        Node f= first.head;
        Node s= last.head;
        Remove_Dul str = new Remove_Dul();
        while ( f!= null && s!= null) {
            if(f.value <s.value){
                str.inserLast(f.value);
                f=f.next;
            }
             else{
                str.inserLast(s.value);
                s=s.next;
            }
        }
        while (f!=null) {
               str.inserLast(f.value);
                f=f.next;
        }
        while (s!=null){
              str.inserLast(s.value);
                s=s.next;
        }
        return str;
    }
    public void Sorted_linked(){
        Node node=head;
        while (node.next!=null) {
            if(node.value == node.next.value){
                node.next= node.next.next;
            }
            else{
            node= node.next;
        }
    }
       taile= node;
       taile.next=null;
       
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
