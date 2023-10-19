package Array.Day_28;

import java.util.HashSet;
import java.util.Set;

public class Remove_Digit_From_Number {
    public static void main(String[] args) {
        String number = "551"; 
        char digit = '5';
        System.out.println(removeDigit(number, digit));
    }
    static String removeDigit(String number, char digit) {
        int ind=0,n=number.length();
        for(int i=0;i<n-1;i++){
            if(number.charAt(i)==digit){
            ind=i;
            if(i<n-1 && digit<number.charAt(i+1))break;
        }  
    }
     number= number.substring(0, ind)+number.substring(ind+1);
        return number;
    } 
}
