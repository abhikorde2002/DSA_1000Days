package Strings.Day_34;

public class Rotation {
    public static void main(String[] args) {
        String str="CDAB";
        String s="ABCD";
        System.out.println(isSub(s, str));
    //    a=s.substring(str.charAt(0),s.length()-1);
    //    System.out.println(a);
    }
    static String isSub(String s,String str){
        int a=-1;
        String sr="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==str.charAt(0)){
               a=i;
            }
        } 
        for(int i=a;i<s.length();i++){
            sr+=s.charAt(i);
        }
        for(int i=0;i<a;i++){
            sr+=s.charAt(i);
        }
        int count=0;

        for(int i=0;i<str.length();i++){
            if(sr.charAt(i)==str.charAt(i)){
                count++;
            }  
        }
        System.out.println(count);
       
       return count>2 ? "String is revers": "String is not rivers";
    }
}
