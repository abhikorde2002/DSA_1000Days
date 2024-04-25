package Sliding_Two_Pointer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Longest_Sub {
    public static void main(String[] args) {
        String s="bbbbb";
       // System.out.println(longest_Sub(s));
   //    System.out.println(ans(s));
   System.out.println(solve(s));
 //  System.out.println(Logic(s));
    }

    //Sliding Windo
    static int solve(String s) {
        HashMap < Character, Integer > mpp = new HashMap < Character, Integer > ();

        int left = 0, right = 0;
        int n = s.length();
        int len = 0;
        while (right < n) {
            if (mpp.containsKey(s.charAt(right))) left = Math.max(mpp.get(s.charAt(right)) + 1, left);
        
            mpp.put(s.charAt(right), right);
                len= Math.max(len, right - left + 1);     
            
          
            right++;
        }
        return len;
    }
    static int Logic(String s){
        int max=0;
        Set<Character> str= new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (str.contains(s.charAt(i))) {
                str.clear();
            }
            str.add(s.charAt(i));
            max=Math.max(max, str.size());
        }
        return max;
    }
    //Two pointer
    static int longest_Sub(String s){
       int max=Integer.MIN_VALUE;
       Set<Character> str= new HashSet<>();
       int left=0;
       for (int i = 0; i < s.length(); i++) {
         if(!str.contains(s.charAt(i))){
             str.add(s.charAt(i));
             max= Math.max(max, i-left+1);
         }
         else{
            while (str.contains(s.charAt(i))) {
                str.remove(s.charAt(left++));
            }
         }
         str.add(s.charAt(i));
     
        }
    return max;
    }
    static int ans(String s){
        if(s.length()==0 || s==null || s.length()==1){
            return s.length();
         }
         Set set= new HashSet();
         int j=0,max=0;
         for(int i=0;i<s.length();i++){
             while(!set.add(s.charAt(i))){
                 set.remove(s.charAt(j++));   
             }
              max=Math.max(max,i-j+1);
         }
         return max;
    }
}
