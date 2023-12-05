package Strings.Day_43;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Letter_Com {
    private static List<String> str= new ArrayList<>();
    private  static Map<Character,String> s= new HashMap<>();
    public static void main(String[] args) {
       String s="23";
       System.out.println(letterCombinations(s)); 
    }
    static List<String> res = null;
    static String [] strMap = {"0","1","abc", "def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static List<String> letterCombinations(String digits) {
        res = new ArrayList<>();
        if(digits.length()==0){
            return res;
        }
          dfs(0,digits,new StringBuilder());
        return res;
    }

    static void dfs(int length ,String digits,StringBuilder temp){

        if(length == digits.length()){
            res.add(temp.toString());
            return; 
        }

        char ch = digits.charAt(length);
        String str = strMap[ch -'0'];

        for(char c:str.toCharArray()){
            temp.append(c);
            dfs(length+1,digits,temp);
            temp.deleteCharAt(temp.length()-1);
        }

    }
}
