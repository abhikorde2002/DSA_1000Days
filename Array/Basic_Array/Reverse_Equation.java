package Array.Basic_Array;

import java.util.Arrays;

public class Reverse_Equation {
    public static void main(String[] args) {
        reverseEqn("20-3+5*2");
    }

    static void reverseEqn(String s){
        char ch[]=s.toCharArray();
       for(int i=0;i<s.length()/2;i++){
             char tem=ch[i];
              ch[i]=ch[s.length()-1];
              ch[s.length()-1]=tem;
       }
      System.out.println(Arrays.toString(ch));
    }
}
