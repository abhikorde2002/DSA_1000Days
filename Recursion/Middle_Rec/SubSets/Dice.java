package Recursion.Middle_Rec.SubSets;

import java.util.ArrayList;
import java.util.List;

public class Dice {
    public static void main(String[] args) {
      //  dice("", 4);
   // dice("", 3,1);
   List<String> s= dices("", 500, 30);
   //System.out.println(s);
   System.out.println(s.size());
      //System.out.println(numRollsToTarget(1, 6, 3));
    }
    // public static int numRollsToTarget(int n, int k, int target) {
    //     ArrayList<String> size=dices("", target);
    //     return size;
    // }

    static void dice(String p,int target,int n){
        if (target == 0) {
            
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            if(n !=0){
            dice(p + i, target - i,n-1);
            }
        }
    }
    static ArrayList<String> dices(String p,int target,int n){
        if (target == 0) {
            ArrayList<String> str= new ArrayList<>();
            str.add(p);
            return str;
        }
        ArrayList<String> left= new ArrayList<>();
        for (int i = 1; i <= 30 && i <= target; i++) {
            if(n!=0){
            left.addAll(dices( p+ i, target - i,n-1));
            }
        }
    return left;
    }

}
