package Strings.Day_40;

import java.util.HashMap;
import java.util.Map;

public class Int_Roman {
    public static void main(String[] args) {
        Roman("1");
    }

    static void Roman(String s){
        Map<Integer,Character> m= new HashMap<>();
        m.put(1, 'I');
        m.put(5,'V');
        m.put(10,'X');
        m.put(50,'L');
        m.put(100,'C');
        m.put(500,'D');
        m.put(1000,'M');
   
        String str="";
        char ch=' ';
        for(int i=0;i<s.length();i++){
            if(i<s.length()-1 && m.get(s.charAt(i))<m.get(s.charAt(i+1)) ){
                ch-=m.get(s.charAt(i));
                str+=ch;
            }
            else{
                ch+=m.get(s.charAt(i));
                str+=ch;
            }
        }
        System.out.println(str);
    }
}
