package Greed;

import java.util.Arrays;

public class Buy_Two_Candies {
    public static void main(String[] args) {
        int arr[]={3,2,2};
        System.out.println(buyChoco(arr, 3));
    }

    public static int buyChoco(int[] arr, int money) {
        Arrays.sort(arr);
        int ans=money;
        int cou=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                if(money-arr[i]>=0){
                    money-=arr[i];
                    cou++;
                    if(cou==2){
                        return money;
                    }
                }
            }
        }
        return ans;
    }
}
