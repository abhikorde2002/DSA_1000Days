package Linked_List.Quesions;

public class Merge_Two {
    private Node head;
    private Node taile;
    private int size;
    public static void main(String[] args) {
        Merge_Two first= new Merge_Two();
        Merge_Two second= new Merge_Two();
        first.inserLast(1);
        first.inserLast(2);
        first.inserLast(3);

        second.inserLast(1);
        second.inserLast(4);
        second.inserLast(5);
        second.inserLast(6);
        
        Merge_Two ans= Merge(first, second);
        ans.display();
    }

    static Merge_Two Merge(Merge_Two first,Merge_Two last){
        Node f=first.head;
        Node s= last.head;

        Merge_Two ans= new Merge_Two();

        while (f!=null && s!=null) {
            if(f.value<s.value){
               ans.inserLast(f.value);
               f= f.next;
            }
            else{
                ans.inserLast(s.value);
                s=s.next;
            }
        }
        while (f!=null) {
            ans.inserLast(f.value);
            f=f.next;
        }
        while (s!=null) {
            ans.inserLast(s.value);
            s=s.next;
        }
        return ans;
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
