package Recursion.Middle_Rec;

public class Pow_N {
    public static void main(String[] args) {
        //System.out.println(Powers(2.00000, 10));
        System.out.println(power(2.00000, 10));
    }

     static double Ans(double x, int n){
        if(n==0) return 1;

        if(n<0) return 1/Ans(x, -n-1);

        if(n%2==0){
            double a= Ans(x, n/2);
            return a*a;
        }
        return x*Ans(x, n-1);
     }
    static double Powers(double x , int n){
        double ans=x;
        for(int i=n-1;i>=0;i--){
            ans*=i;
        } 
        return ans;
    }
    static double power(double x,int n){
        if(n==0){
            return 1;
        }

        if(n<0){
            return 1/power(x, -n-1);
        }
        if(n%2==0){
            double a=power(x, n/2);
            return a*a;
        }
        return (double)x*power(x, n-1);
    }

}
