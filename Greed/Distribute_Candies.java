package Greed;

import java.util.HashSet;
import java.util.Set;

public class Distribute_Candies {
    public static void main(String[] args) {
        int arr[]={1,1,2,3};
        System.out.println(distributeCandies(arr));
    }
    static int distributeCandies(int[] candyType) {
        Set<Integer> s= new HashSet<>();
        for (int i = 0; i < candyType.length; i++) {
            s.add(candyType[i]);
        }
int ans=candyType.length/2;
        return ans>=s.size() ?s.size(): ans;
    }
}
