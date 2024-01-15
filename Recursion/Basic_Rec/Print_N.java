package Recursion.Basic_Rec;

public class Print_N {
    public static void main(String[] args) {
      Print(5);
      System.out.println();
      Prints(5);
    }

    static void Print(int n){
        if(n==0){
            //System.out.println(n);
            return;
        }
       System.out.println(n);
       Print(n-1);
    }
    static void Prints(int n){
      if(n==0){
          //System.out.println(n);
          return;
      } Prints(n-1);
     System.out.println(n);
    
  }
  }

