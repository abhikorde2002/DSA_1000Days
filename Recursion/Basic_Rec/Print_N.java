package Recursion.Basic_Rec;

public class Print_N {
    public static void main(String[] args) {
      Print(2);
    }

    static void Print(int n){
        if(n==0){
           // System.out.println(n);
            return;
        }
       System.out.println(n);
       Print(n-1);
    }
}
