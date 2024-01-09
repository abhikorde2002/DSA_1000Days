package Anchal.Basic_Array;

public class Sum_prime {
    public static void main(String[] args) {
        System.out.println(prime_Sum(10));
    }

    public static long prime_Sum(int n)
    {
        // code here
         if(n==0 || n==1)return 0;
        long cou=0;
        for(long i=2;i<=n;i++){
            if(isPrime(i)) cou+=i;
        }
        return cou;
    }
    
      public static  boolean isPrime(long n){
        boolean isPrime=true;
        if(n==2)return true;
        for(long i=2;i<=n/2;i++){
            if(n%i==0) return false;
        }
        return isPrime;
    }
}
