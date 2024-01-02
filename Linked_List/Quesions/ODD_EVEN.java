package Linked_List.Quesions;

public class ODD_EVEN {
    public ListNode head;
    public ListNode taile;
    public int size;
    public ODD_EVEN(){
        this.size=0;
    }
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
         public void inserFirst(int value){
            ListNode node= new ListNode(value);
            node.next= head;
            head=node;
            if(taile==null){
                taile=head;
            }
    
            size+=1;
        }
        public ListNode oddEvenList() {
            // ArrayList<Integer> arr= new ArrayList<>();
           if(head==null || head.next==null){
               return head;
           }
           ListNode even=head;
           ListNode odd= head.next;
           ListNode t=odd;
           
           while(even.next != null && even.next.next!=null ){
               even.next= even.next.next;
               odd.next = odd.next.next;
               even= even.next;
               odd= odd.next;
           }
           even.next=t;
           return head;
        }
    public void display(){
        ListNode tem=head;
        while (tem != null) {
            System.out.print(tem.val + " -> ");
            tem=tem.next;
        }
       // System.out.println("End");
    }
    private static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> "); // Print the data in the current node
            head = head.next; // Move to the next node
        }
        //System.out.println("Hi");
    }

    public static void main(String[] args) {
        ODD_EVEN odd= new ODD_EVEN();
        odd.inserFirst(5);
        odd.inserFirst(4);
        odd.inserFirst(3);
        odd.inserFirst(2);
        odd.inserFirst(1);
       // odd.display();
        ListNode head=odd.oddEvenList();
        print(head);
        
    }
}
