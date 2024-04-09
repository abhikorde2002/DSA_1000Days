package Stack_Queue;

import java.util.LinkedList;
import java.util.Stack;

public class Remove_K {
    public static void main(String[] args) {
        String s= "1432219";
    System.out.println(remove(s, 3));
    }
    public static String Remove(String s, int k) {
  Stack<Character> b= new Stack<>();
        for(Character ch:s.toCharArray())
        {
            
            while(!b.isEmpty() && k!=0 && b.peek()>ch)
            {
                b.pop();
                k--;
            }
            if (!b.isEmpty() ||  ch!='0' )
                b.push(ch);
        }
    
      while(!b.isEmpty() && k-->0){
        b.pop();
      }
      if(b.isEmpty())return "0";
        String ans="";
        while(!b.isEmpty()){
            ans=b.pop()+ans;
        }
        return ans;
    }

    static String remove(String s,int k){

        LinkedList<Character> b= new LinkedList<>();
        for(char ch:s.toCharArray())
        {
            
            while(!b.isEmpty() && k!=0 && b.peekLast()>ch)
            {
                b.removeLast();
                k--;
            }
            b.addLast(ch);
        }
        System.out.println(b);
        for(int i=k;i>0;i--)
        {
            b.removeLast();
        }
        System.out.println(b);
        boolean isTrue= true;
        String str="";
        for(char ch:b){
            if (ch==0 && isTrue) {
                continue;
            }
            isTrue=false;
            str+=ch;
        }
        return str.isEmpty()? "0" :str;
        
        //     String str="";
        //      for (int i = 0; i < s.length(); i++) {
        //       if(i!=s.length()-1  && s.charAt(i)>s.charAt(i+1) && k!=0){
        //             k--;
        //       }
        //       else if(i!=s.length()-1  && s.charAt(i)<s.charAt(i+1) || k==0){
        //           str+=s.charAt(i);
        //       }
        //       else if(k==1 && i==s.length()-1){
        //           k--;
        //       }
        //       else{
        //           str+=s.charAt(i);
        //       }
        //      }
        //      while(!str.isEmpty() && str.length()!=1 && str.charAt(0)=='0'){
          
        //       str= str.substring(1,str.length());
        //   }
        //   if(str.isEmpty()){
        //       return "0";
        //   }
        //     return str ;
          }
}
