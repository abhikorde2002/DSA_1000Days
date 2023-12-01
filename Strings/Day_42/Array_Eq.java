package Strings.Day_42;

public class Array_Eq {
    public static void main(String[] args) {
        String s[]={"a", "cb"};
        String b[]={"ab", "c"};
        System.out.println(Eql(s, b));
        System.out.println(arrayStringsAreEqual(s, b));
    }

    static boolean Eql(String st[],String s[]){
        String str="";
           String sb="";
        for(int i=0;i<st.length && i<sb.length();i++){
            str+=st[i];
           
        }
        for(int i=0;i<s.length;i++){
            sb+=s[i];
        }
        if(str.length()!=sb.length())return false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=sb.charAt(i))return false;
        }
        return true;
    }
    public  static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str= "";
        String str1="";
        for(int i=0;i<word1.length;i++){
            str+=word1[i];
        }
         for(int i=0;i<word2.length;i++){
            str1+=word2[i];
        }
        return str.equals(str1);
    }
}
