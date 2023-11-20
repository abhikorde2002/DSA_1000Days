package Strings.Day_39;

public class valid_palindrom {
    public static void main(String[] args) {
        Palindrom(",,,,,,,,,,,,acva");
        System.out.println(Palindroms(",,,,,,,,,,,,acva"));
    }
    static void Palindrom(String s){
        int a=0;
        char ch;
        String str="";
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                str+=ch;
            }
        }
         if(str.length()==0|| str.length()==1){
            System.out.println("Palindrom");
        }
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)==str.charAt(str.length()-1-i)){
                a++;  
            }
        }
        System.out.println((a==str.length()/2)? " Palindrom":"Not Palindrom");
}

   static boolean Palindroms(String s){
       if(s.isEmpty()){
         return true;
       }
       int start=0;
       int end=s.length()-1;
       while (start<=end) {
        char current=s.charAt(start);
        char last=s.charAt(end);
        if(!Character.isLetterOrDigit(current)){
            start++;
        }
        else if(!Character.isLetterOrDigit(last)){
            end--;
        }
        else{
            if(Character.toLowerCase(current)!=Character.toLowerCase(last)){
                return false;
            }
            start++;
            end--;
        }
    
       }
       return true;
   }
}