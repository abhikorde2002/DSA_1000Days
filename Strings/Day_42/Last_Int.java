package Strings.Day_42;

import java.util.ArrayList;
import java.util.List;

public class Last_Int {
    public static void main(String[] args) {
        List<String> word=new ArrayList<>();
        word.add("-42");
         word.add("2");
        word.add("prev");
        word.add("prev");
        word.add("prev");
       
        System.out.println(lastVisitedIntegers(word));
    }
    public  static List<Integer> lastVisitedIntegers(List<String> word) {
        // int next=0;
        // String pre="";
        // List<String> str= new ArrayList();
        // for(int i=0;i<words.size();i++){
        //     if(words.get(i)=="prev"){
        //         next=i-1;
        //         while (next>0) {
        //             if(words.get(next)=="1"|| words.get(next)=="2" &&pre!=words.get(next) ){
        //                  str.add(words.get(next));
        //                  pre=words.get(next);
        //                  next=0;
        //             }
                
        //         next--;
                
        //     }
        //     }
        // }
        // return str;
        List<Integer> ans= new ArrayList<>();
       List<Integer> digits= new ArrayList<>();
       int k=0;
       for(int i=0;i<word.size();i++){
           if(word.get(i).equals("prev")){
                   k++;
ans.add((digits.size() - k < digits.size() && digits.size() - k >= 0) ? digits.get(digits.size() - k) : -1);
               
           }
           else{
             digits.add(Integer.valueOf(word.get(i)));
             k=0;
           }
       }
       return ans; 
    }
}
