package Strings.Day45;

public class Remove_OUt_Paran {
    public static void main(String[] args) {
        String s="(()())(())(()(()))";
      //  System.out.println(Parentheses(s));
        System.out.println(Parenthese(s));
        System.out.println(Par(s));
    }
    
    static String Parentheses(String s){
        
        String str="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i+1)){
                int start=i+1;
                while (start<s.length()) {
                    if(s.charAt(start)!=s.charAt(start+1)){
                        str+=s.charAt(start);
                    }
                    
                    else{
                        str+=s.charAt(start);
                        start+=2;
                    }
                      start++;
                }   
                i=start;   
            }
            
        }
        
        return str;
    }

    static String Parenthese(String s){
        String str="";
        int cou=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' && cou==0 ){
                cou++;
            }
           
            else if(s.charAt(i)=='('&& cou>=1){
                str+=s.charAt(i);
                cou++;
            }
            else if(s.charAt(i)==')'&& cou>1){
                 str+=s.charAt(i);
                cou--;
            }
             else if(s.charAt(i)==')' && cou==1){
                cou--;
            }
        }
        System.out.println(str);
        return str;
    }
    static String Par(String s){
        int len = s.length();
        if (len <= 2) return "";
        char[] c = s.toCharArray();
        StringBuilder newString = new StringBuilder();
        int open = 1;
        for (int i = 1; i < len; i++) {
            if (c[i] == '(') {
                open++;
                if (open > 1) newString.append('(');
            }
            else {
                if (open > 1) newString.append(')');
                open--;
            }
        }
        return newString.toString();

    }

}


