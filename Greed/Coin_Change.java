package Greed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Coin_Change {
    public static void main(String[] args) {
        // int arr[]={186,419,83,408};
        // System.out.println(coinChange(arr, 6249));
       System.out.println(minPartition(1000));
       
        int arr[]={9,6,5,1};
        System.out.println(minCoin(arr, 0, 11));

    }
    public static int minCoin(int coins[], int M, int sum) {
        // Your code goes here
        if (sum==0) {
            return 0;
        }
        Arrays.sort(coins);
        int amount=0;
        int count=0;
        for (int i = coins.length-1; i >=0; ) {
            if(amount+coins[i]<=sum){
                amount+=coins[i];
                count++;
                
            }
            else{
                i--;
            }
        }
        return count;
    }
    static  List<Integer> minPartition(int amount)
    {
        // code here
        int arr[]={1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        List<Integer> list= new ArrayList<>();
         if(amount==0)return list;
        for(int i=arr.length-1;i>=0;){
            if(arr[i]<=amount){
                amount-=arr[i];
                list.add(arr[i]);
            }
            else{
                i--;
            }
        }
        
        return list; 
    }

    public static int coinChange(int[] arr, int amount) {
        int coins=0;
        Arrays.sort(arr);
        if(amount==0)return 0;
        for(int i=arr.length-1;i>=0;){
            if(arr[i]<amount){
                amount-=arr[i];
                coins++;
            }
            else{
                i--;
            }
        }
        if(amount>0){
            return -1;
        }
        return coins; 
    }
}
