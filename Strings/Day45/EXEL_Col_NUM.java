package Strings.Day45;

import java.util.Arrays;

public class EXEL_Col_NUM {
    public static void main(String[] args) {
        String s="AB";
        System.out.println(Colum_NUM(s));
        System.out.println(Excel(s));
    }
    static int Colum_NUM(String s){
       int sum=1,ans=0;
       for(int i=s.length()-1;i>=0;i--){
        ans+=(s.charAt(i)-'A'+1 ) * sum;
        sum*=26;
       }
       return ans;
    }

    static int Excel(String s){
        int sum=1,ans=0;
        for(int i=0;i<s.length();i++){
            int a=s.length()-1-i;
            System.out.println(a);
            ans+=(s.charAt(i)-'A'+1)*(26^a);
        }
        return ans;
    }
}
