package Recursion.Basic_Rec;

public class Rev_int {
    public static void main(String[] args) {
        Revers(123);
        int rev=0;
        System.out.println(Reminder(123, rev));
    }

    static void Revers(int n){
        if(n==0){
            System.out.println();
            return;
        }
    //     int rev=0;
    //   rev = rev+ n %10;
      System.out.print(n%10 );
       Revers(n/10);
    }
    static int Reminder(int n ,int rev){
        if(n==0){
            return rev;
        }
        
        rev= rev*10 + (n%10);
        return Reminder(n/10, rev);
    }
}
