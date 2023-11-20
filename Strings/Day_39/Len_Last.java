package Strings.Day_39;

public class Len_Last {
    public static void main(String[] args) {
        String s="Hello World";
        Last_Word(s);
      System.out.println(Last(s));
      
      
    }
    static void Last_Word(String s){
        //  String str=s.trim();
        //  String[] a;
        //  a=str.split(" ");
        //  System.out.println(a[a.length-1]);
        String str=s.trim();
        String[] a;
        a=str.split(" ");
        String ans=a[a.length-1];
        int b=ans.length();
         System.out.println(b);
    }
    static int Last(String s){
        int a=0;
        s=s.trim();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                a++;
            }
            else{
                break;
            }
        }
        return a;

        
    }

}
