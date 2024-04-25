package Strings.Day101;

import java.util.Arrays;

public class Long_Comm {
    public static void main(String[] args) {
        String s[]={"flower","flow","flight"};
        System.out.println(longest_Comm(s));

    }
    static String longest_Comm(String[] s){
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        String sr=s[0];
        String a=s[s.length-1];
        int ind=0;
        while (ind<sr.length() && ind<a.length() && sr.charAt(ind)==a.charAt(ind)) {
            ind++;
        }
        return sr.substring(0, ind);
    }
}
