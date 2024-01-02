package Linked_List.Quesions;

public class Middle_LinkedList {
    public static ListNode head;
    public ListNode taile;
    public int size;
    public Middle_LinkedList(){
        this.size=0;
    }
    public ListNode middleNode() {
       
        ListNode node=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            node=node.next;
            fast=fast.next.next;
        }
     //  display();
        return node;
    }
    private static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> "); // Print the data in the current node
            head = head.next; // Move to the next node
        }
        System.out.println();
    }
    public void inserFirst(int value){
        ListNode node = new ListNode(value);
        node.next= head;
        head=node;
        if(taile==null){
            taile=head;
        }

        size+=1;
    }
    public void display(){
        ListNode tem=head;
        while (tem != null) {
            System.out.print(tem.val + " -> ");
            tem=tem.next;
        }
        System.out.println("End");
    }
    public static void main(String[] args) {
        Middle_LinkedList md= new Middle_LinkedList();
        md.inserFirst(1);
        md.inserFirst(2);
        md.inserFirst(3);
        md.inserFirst(4);
       md.display();

       head=md.middleNode();
       md.print(head);

    }
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
}
