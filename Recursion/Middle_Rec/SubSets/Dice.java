package Recursion.Middle_Rec.SubSets;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
      //  dice("", 4);
      System.out.println(dices("", 4));
      //System.out.println(numRollsToTarget(1, 6, 3));
    }
    // public static int numRollsToTarget(int n, int k, int target) {
    //     ArrayList<String> size=dices("", target);
    //     return size;
    // }

    static void dice(String p,int target){
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }
    static ArrayList<String> dices(String p,int target){
        if (target == 0) {
            ArrayList<String> str= new ArrayList<>();
            str.add(p);
            return str;
        }
        ArrayList<String> left= new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            left.addAll(dices( p+ i, target - i));
        }
    return left;
    }

}
