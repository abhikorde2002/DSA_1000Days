package Recursion.Middle_Rec;

public class Pow_Two {
    public static void main(String[] args) {
       
        // System.out.println(isPowerOfTwo(1));
        // System.out.println(Math.sqrt(8));
        // System.out.println((int)Math.pow(2,0 )==1);
        System.out.println(isPowerOfTwos(1));
    }

    public static boolean isPowerOfTwo(int n) {
        double a=Math.ceil(Math.sqrt(n));
        for(int i=0;i<=a;i++){
            double ans=Math.ceil(Math.pow(2,i ));
            // System.out.println(ans);
           if(ans==n){
               return true;
           }      
       }
       return false;
    }

    public static boolean isPowerOfTwos(int n) {
        if(n==1)return true;

      //   if(n%2!=0 || n<1){
      //       return false;
      //   }
        if(n<1)return false;
        return (n%2==0 ) &&  isPowerOfTwo(n/2);
  }
}
