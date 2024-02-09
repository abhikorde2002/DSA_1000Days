package Strings.Day_46;

public class Largest_Oddnum {
    public static void main(String[] args) {
        String s= "52";
        System.out.println(largestOddNumber(s));
    }

    static String largestOddNumber(String str){
        if((int) str.charAt(str.length()-1)%2==1){
              return str;
        }
        int i=str.length()-1;
        while (i>=0) {
            int n=str.charAt(i);
            if(n%2==1){ return str.substring(0, i+1);}
            i--;
        }
        return "";
    }
}
