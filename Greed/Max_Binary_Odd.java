package Greed;

public class Max_Binary_Odd {
public static void main(String[] args) {
    String s="0101";
    System.out.println(maximumOddBinaryNumber(s));
}
static String maximumOddBinaryNumber(String s) {
        int zero=0;
        int one=0;
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)=='1') {
                one++;
            }else zero++;
        }
        char c[]=new char[s.length()];
        for (int i = 0; i < one-1; i++) {
            c[i]='1';
        }
        for (int i = one-1; i < one-1 + zero; i++) {
            c[i]='0';
        }

        c[s.length()-1]='1';
        return new String(c);
    }    
}
