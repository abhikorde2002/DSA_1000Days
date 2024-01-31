package Recursion.Basic_Rec;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println(Pali(123));
        System.out.println(Rev(121));
    }
    static boolean Rev(int n){
        return n== Pali(n);
    }
    static int Pali(int n){
        int digits= (int)(Math.log10(n))+1;
        return Revers(n,digits);
    }
  private   static int  Revers(int n,int digits){
        if(n%10== n){
            return n;
        }
    //     int rev=0;
    //   rev = rev+ n %10;
      int rem=n%10;
      return rem * (int) (Math.pow(10, digits-1))+ Revers(n/10,digits-1);
    }
}
