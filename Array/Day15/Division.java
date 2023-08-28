package Array.Day15;

public class Division {
    public static void main(String[] args) {
        linear(10, 3);
        System.out.println(divison(10, 5));
    }

    static void linear(int num,int num1){
        int count=0;
        double h=(double)num;
        double hr=(double)num1;
         while(h>0){
            h-=hr;
            count++;
            h--;
        }
        System.out.println(count);
    }
    static int divison(int divison,int divisor){
        int start=1;
        int end=divison;
        while(start<=end){
            int mid=start + (end-start)/2;
            if(Math.abs(divisor*mid)==Math.abs(divison)){
                return mid;
            }
            else if(Math.abs(divisor*mid) >Math.abs(divison)){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return end;
    }
}
