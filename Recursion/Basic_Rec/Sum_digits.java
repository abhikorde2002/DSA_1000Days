package Recursion.Basic_Rec;

public class Sum_digits {
    public static void main(String[] args) {
        System.out.println(Sum(1342));
    }

    static int Sum(int n){
        if(n==0){
            return 0;
        }

        return (n%10) + Sum(n/10);
    }
}
