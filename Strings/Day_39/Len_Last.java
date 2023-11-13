package Strings.Day_39;

public class Len_Last {
    public static void main(String[] args) {
        String s="Hello World";
        Last_Word(s);
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
        System.out.println(ans.length()-1);
        // return ans;
    }
}
