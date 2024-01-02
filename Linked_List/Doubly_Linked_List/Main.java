package Linked_List.Doubly_Linked_List;

public class Main {
    public static void main(String[] args) {
        DDL dd= new DDL();
        dd.inserFirst(3);
        dd.inserFirst(5);
        dd.inserFirst(7);
        dd.inserFirst(10);
        dd.inserFirst(20);
        
        dd.insetlast(24);
        dd.Display();
        
        dd.insert(7,6);
        System.out.println("Delete last:-");
         dd.DeleteLast();
         dd.Display();
         
         dd.DeleteFirst();
        dd.Display();

        dd.DeleteLast();
        dd.Display();
}
    

}
