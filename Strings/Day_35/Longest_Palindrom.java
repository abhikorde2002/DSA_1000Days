package Strings.Day_35;

public class Longest_Palindrom {
    public static void main(String[] args) {
        String str="babad";
        String s="babad";
        System.out.println(Longest(str));
        System.out.println(longestPalin(s));
    }
    static String Longest(String s){
        char ch[]=s.toCharArray();
        int count=0;
          String str=Character.toString(s.charAt(0));
          if(s.length()==0|| s.length()==1){
            return s;
          }
            for(int i=0;i<s.length();i++){
            int start=i;
            int end=s.length()-1;
                if((end-start)+1<=str.length())break;
                if(s.charAt(start)==s.charAt(end)){
                    if(isPalindrom(s, start, end)){
                        if( (end-i)+1 >str.length()){
                            str=s.substring(start, end+1);
                        }
                    }
                }
            
        }
       return str;
    }
    static boolean isPalindrom(String str,int start,int end){
        while(start<=end){
            if(str.charAt(start)!=str.charAt(end))return false;
            start++;
            end--;
        }
        return true;
    }

    static String longestPalin(String S){
        // code here
        int len = S.length();
        if(len==0 || len==1) return S;
        String ans = Character.toString(S.charAt(0));
        for(int i=0; i<len; i++){
            for(int j=len-1; j>i; j--){
                if((j-i)+1 <= ans.length()) break;
                if(S.charAt(i) == S.charAt(j)){
                    if(isPalindrome(S, i, j)){
                        if((j-i)+1 > ans.length()){
                            ans = S.substring(i, j+1);
                        }
                    }
                }
            }
        }
        return ans;
    }
    public static boolean isPalindrome(String str, int s, int e){
        while(s < e){
            if(str.charAt(s) != str.charAt(e)) return false;
            s++;
            e--;
        }
        return true;
    }
}
