package Recursion.Middle_Rec.Patterns;

public class Pattern_1 {
    public static void main(String[] args) {
       search(5, 0);
       System.out.println();
       Trangel(5, 0, 0);
       System.out.println();
       Normal(5, 0);
    }
    static void Normal(int n,int c){
        if(n==0){
            return;
        }
       if(c<n){
        Normal(n, c+1);
        System.out.print("*"+" ");
       }
       else{
       
        Normal(n-1, 0);
        System.out.println();
       }
    }
    static void search(int n,int c){
        if(n==0){
            return;
        }
       if(c<n){
        System.out.print("*"+" ");
        search(n, c+1);
       }
       else{
        System.out.println();
        search(n-1, 0);
       }
    }
    static void Trangel(int n,int c,int i){
        if(c==n){
            return;
        }
        if (i<=c){
            System.out.print("*"+" ");
            Trangel(n, c, i+1);
        }
        else{
            System.out.println();
            Trangel(n, c+1,0 );
        }
    }
   
}
