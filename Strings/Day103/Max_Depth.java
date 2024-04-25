package Strings.Day103;

import java.util.Stack;

public class Max_Depth {
    public static void main(String[] args) {
        String s="(1+(2*3)+((8)/4))+1";
        System.out.println(count(s));
    }

    static int count(String s){
        Stack<Character> str= new Stack<>();
        int cou=0;
        int max=0;
        for(char ch: s.toCharArray()){
            if(ch == '('){
                str.add(ch);
                cou++;
                max=Math.max(max, cou);
            }
            else if(ch==')'){
                     cou--;
                     str.pop();
                    // if( str.isEmpty()|| str.pop() != '('){
                    //     return -1;
                    // }
            }
            // else{
            //     continue;
            // }
        } 
        return max;
    }
}
