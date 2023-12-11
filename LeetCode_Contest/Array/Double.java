package LeetCode_Contest.Array;

import java.util.ArrayList;
import java.util.List;

public class Double {
    public static void main(String[] args) {
        int arr[][]={{2,3,3,10}};
        getDouble(arr, 2);
    }

    static List<Integer> getDouble(int variables[][],int target){
      List<Integer> result = new ArrayList<>();

        for (int i = 0; i < variables.length; i++) {
            int[] currentVar = variables[i];
            int base = currentVar[0];
            int exponent = currentVar[1];
            int modulus = currentVar[2];
            int mod=currentVar[3];
            double m=mod;
         double bs= base;
         double ex= exponent;
         double mo= modulus;
            // Calculate (base^exponent % modulus)
            int value = 1; 
               double ans=Math.pow(bs, ex);
                value = (int) (Math.pow((ans % 10 ),modulus)% m);
            
System.out.println(value);
            // Check if the result is equal to the target
            if (value == target) {
                result.add(i);
            }
        }

        return result;
       }
    }

