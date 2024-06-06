package LeetCode_Contest.String;

import java.util.Arrays;

public class WatingRoom {
    public static void main(String[] args) {
        String s="ELELEEL";
        System.out.println(minChairsNeeded(s));
    }
    public static int minChairsNeeded(String s) {
        int currentPeople = 0;
        int maxPeople = 0;
        
        for (char event : s.toCharArray()) {
            if (event == 'E') {
                currentPeople++;
            } else if (event == 'L') {
                currentPeople--;
            }
            
            if (currentPeople > maxPeople) {
                maxPeople = currentPeople;
            }
        }
        
        return maxPeople;
    }
}
