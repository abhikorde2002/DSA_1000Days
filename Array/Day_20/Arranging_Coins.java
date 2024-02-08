package Array.Day_20;

public class Arranging_Coins {
    public static void main(String[] args) {
     System.out.println(arrangeCoins(5));
     System.out.println(Coines(5));
    }
    public static int arrangeCoins(int n) {
        int i=1;
        while(n>0){
            i++;
            n-=i;
        }
        return i-1;
    }

    static int Coines(int n){
       int start=1;
       int end=n;
       while(start<=end){
          int mid=start+ (end-start)/2;
          int coines= (mid * (mid+1))/2;
          if(coines==n){
            return mid;
          }
          if(coines>n){
            end=mid-1;
          }
          else{
            start=mid+1;
          }
       }
       return end;
    }
}
