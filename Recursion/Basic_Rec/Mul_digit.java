package Recursion.Basic_Rec;

public class Mul_digit {
    public static void main(String[] args) {
        System.out.println(Mul(55));
    }

    static int Mul(int n){
        if(n%10 ==n){
            return n;
        }
        return (n%10) * Mul(n/10);
    }
}
