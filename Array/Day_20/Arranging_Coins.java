package Array.Day_20;

public class Arranging_Coins {
    public static void main(String[] args) {
     System.out.println(arrangeCoins(1));
    }
    public static int arrangeCoins(int n) {
        int i=1;
        while(n>0){
            i++;
            n-=i;
           
        }
        return i-1;
    }
}
