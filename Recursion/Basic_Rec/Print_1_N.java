package Recursion.Basic_Rec;

public class Print_1_N {
    public static void main(String[] args) {
        //Print(10);
        printNos(10);
    }

    // static void Print(int N){
    //     int a=1;
    //     if(a==N){
    //         System.out.println(N);
    //         return ;
    //     }
    //     System.out.println(a);
    //     Print(a+1);
    // }
    public static void printNos(int n)
    {
        //Your code here
        Arr(n+1,1);
      
    }
    
    public static void Arr(int n,int i){
        if(i>=n){
            return;
        }
        System.out.println(i+" ");
         Arr(n,i+1);
    }
}
