package Recursion.Basic_Rec;

public class Factour {
    public static void main(String[] args) {
        System.out.println(Print(5));
    }

    static int Print(int n){
        if(n==0){
           return 1;
            
        }

       int a= n*Print(n-1);
       return a;
    }
}
