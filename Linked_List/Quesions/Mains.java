package Linked_List.Quesions;

public class Mains {
    public static void main(String[] args) {
        Insert_Node node = new Insert_Node();
        node.insetFirst(1);
        node.insetFirst(2);
        node.insetFirst(3);
        node.insetFirst(4);
        node.display();
        node.insetFirst(6);
        node.display();
        System.out.println();
        
        Delet_Nodes del= new Delet_Nodes();
        del.inserFirst(1);
        del.inserFirst(2);
        del.inserFirst(3);
        del.inserFirst(4);
        del.inserFirst(5);
        del.DeleteFirst();
        del.display();
        del.delet(2);
        System.out.println();
        del.display();

        length len= new length();
        len.insetFirst(1);
        len.insetFirst(2);
        len.insetFirst(3);
        len.insetFirst(4);
        len.insetFirst(5);

        len.Sizes();
        //len.display();
    }
}
