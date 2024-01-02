package Array.Day_1;

public class Prime {
    public static void main(String[] args) {
        System.out.println(prime(1500000));
    }

    static int prime(int n){
        if(n==0 || n==1){
            return 0;
        }
        int cou=1;
        for(int i=3;i<n/2;i++){
            if(isPrime(i)){
             cou++;
            }
        }
        return cou;
    }
    static  boolean isPrime(long n){
        boolean isPrime=true;
        if(n==2){return true;}
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }           
        }
        return isPrime;
    }
}
