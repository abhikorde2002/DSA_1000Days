package Strings.Day_38;

import java.util.Arrays;

public class COM_Prifix {
    public static void main(String[] args) {
        String str[]={"dog","racecar","car"};
        
        System.out.println(Longest(str));
        System.out.println(longestCommonPrefix(str));
    }

    static String Longest(String str[]){
      String sr=str[0];
      int ans=Integer.MAX_VALUE;
      String st="";
      for(int i=1;i<str.length;i++){
        String s=str[i];
        if(s.length()!=sr.length())break;
           for(int j=0;j<s.length()-1;j++){
              if(s.charAt(j)==sr.charAt(j)){
                 st=(String) s.subSequence(0, j+1);
              }
           }
           ans=Math.min(ans, st.length());
      }

    return st=="" ?"" : st.substring(0, ans);
    }
    public static String longestCommonPrefix(String[] str) {
        Arrays.sort(str);
        String sr=str[0];
        String st=str[str.length-1];
        int ind=0;
        while(ind<sr.length() && ind<st.length() && sr.charAt(ind)==st.charAt(ind)){
            ind++;
        }
        return sr.substring(0,ind);
    }


   
}
