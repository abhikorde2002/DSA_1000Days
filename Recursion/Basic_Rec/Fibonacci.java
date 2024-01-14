package Recursion.Basic_Rec;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        Print(4);
        System.out.println(fibo(4));
        System.out.println(Arrays.toString(Series(5)));
    }

    static void Print(int a){
        int n=0,n1=1;
        // System.out.println(n);
        // System.out.println(n1);
         int num=0;
        while(a>1){
        num = n+n1;
      //  System.out.println(num);
        n=n1;
        n1=num;
        a--;
        }
        System.out.println(num);
    }

    static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int a= fibo(n-1)+fibo(n-2);
        return a;
    }

   static long[] Series(int n) {
        long[] fibSeries = new long[n + 1];
       // code here
        fib(fibSeries,n+1,0);
        return fibSeries;
       
       }
       static long[] fib(long[] arr,int n,int a){
           if(a>=n){
               return arr;
           }
           if(a==0 || a==1){
               arr[a]=a;
           }
           else{
               arr[a]=arr[a-1]+arr[a-2];
           }
           return fib(arr,n,a+1);
       }

}
