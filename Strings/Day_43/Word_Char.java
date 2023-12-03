package Strings.Day_43;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Word_Char {
    public static void main(String[] args) {
        String s[]={"cat","bt","hat","tree"};
        String word="atach";
        // System.out.println(Word(s, word));
        System.out.println(countCharacters(s, word));
    }

    // static int Word(String s[],String str){
    //     int cou=0;
    //     int a=0;
    //     String st;
        
    //     for(int i=0;i<s.length;i++){
    //         st=s[i];
    //         int start=0;
    //         char ch[]=st.toCharArray();
    //         Arrays.sort(ch);
    //         char c[]=str.toCharArray();
    //         Arrays.sort(c);
    //         System.out.println(ch);
    //         for(int j=0;j<st.length() && start<st.length();j++){
    //             if(ch[j]==c[start]){
    //                 cou++;
    //             }System.out.println(cou);
    //             start++;
    //         }
    //         System.out.println(cou);
    //         if(cou==st.length()){
    //             a+=st.length();
    //         }
    //         cou=0;
    //     }
    //     return a;
    // }
    public static int countCharacters(String[] words, String chars) {
        int result = 0;
       for (String word : words) {
           if (canFormWord(word, chars)) {
               result += word.length();
           }
       }
       return result;
   }

   private static boolean canFormWord(String word, String chars) {
       int[] charCount = new int[26];

       for (char ch : chars.toCharArray()) {
           charCount[ch - 'a']++;
       }
       for (char ch : word.toCharArray()) {
           if (charCount[ch - 'a'] == 0) {
               return false;
           }
           charCount[ch - 'a']--;
       }
       return true;
   }
}
