package LeetCode_Contest.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class News {
    public static void main(String[] args) {
        int arr[]={2,5};
        String s="saff";
       
      //  System.out.println(numberGame(arr));
      System.out.println(Arrays.toString(numberGames(arr)));
    }

    public static  int[] numberGame(int[] nums) {
        Set<Integer> str= new HashSet<>();
       int arr[]=new int[nums.length];
       int b=0;
       for(int i=0;i<nums.length;i++){
           int a=Integer.MAX_VALUE;
           int s=Integer.MAX_VALUE;
           
           while(i<nums.length && !str.contains(nums[i])){
                  a=Math.min(a, nums[i]);
                i++;
           }
           System.out.println(a);
           str.add(a);
           arr[++b]=a;
           while (i<nums.length ) {
            if(!str.contains(nums[i])){
                 s=Math.min(s, nums[i]);
                i++;
            }
           }
           System.out.println(s);
           str.add(s);
           arr[--b]=s;
          
           if(str.size()==nums.length){
            return arr;
           }else{
            b+=2;
           }
          i+=2;
       }
       return null;
   }
    public static int[] numberGames(int[] nums) {
         List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            numList.add(num);
        }

        // Sort the list in ascending order
        Collections.sort(numList);

        // Initialize two lists for Alice and Bob
        List<Integer> alice = new ArrayList<>();
        List<Integer> bob = new ArrayList<>();

        // Alternate turns between Alice and Bob
        while (!numList.isEmpty()) {
            // Alice's turn
            alice.add(numList.remove(0));

            // Check if there are remaining elements
            if (!numList.isEmpty()) {
                // Bob's turn
                bob.add(numList.remove(0));
            }
        }
        System.out.println(alice);
        System.out.println(bob);
        // Combine the lists in reverse order to get the final result

        List<Integer> result = new ArrayList<>();
        while ( !bob.isEmpty()) {
            // if(nums[0]==alice.get(0)){
            //     if(!alice.isEmpty()){
            //     result.add(alice.remove(0));
            //  }
            //  result.add(bob.remove(0));
            // }
           
             result.add(bob.remove(0));
             if(!alice.isEmpty()){
                result.add(alice.remove(0));
             
        }    }

        // Collections.reverse(bob);
        // result.addAll(bob);
System.out.println(result.size());
        // Convert the result list to an array
        int[] arrResult = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arrResult[i] = result.get(i);
        }

        return arrResult;
    }
}
