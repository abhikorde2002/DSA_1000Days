package Recursion.Basic_Rec;

public class Palindrom {
    public static void main(String[] args) {
        //System.out.println(Pali(123));
    }

    // static boolean Pali(int n){
    //     return  (n==Revers(n));
    // }
    static void Revers(int n){
        if(n==0){
            return;
        }
    //     int rev=0;
    //   rev = rev+ n %10;
      System.out.print(n%10 +" ");
       Revers(n/10);
    }
}
