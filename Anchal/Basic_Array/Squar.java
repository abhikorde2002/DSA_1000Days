package Anchal.Basic_Array;

public class Squar {
    public static void main(String[] args) {
        
        int a=4;
        System.out.println(countSquares(a));
    }
    static int countSquares(int n) {
        // code here
        if(n==1 || n==0){return 0;}
        if(n==2) {return 1;}
        int cou=1;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(i*i<n){
                cou++;
            }
        }
        return cou;
    }
}
