package Array.Day_1;

import java.util.Arrays;

public class Pluse_One {
    public static void main(String[] args) {
       int digits[]={9};
    System.out.println(Arrays.toString( Pluse_digits(digits))); 
     
    }
    static int[] Pluse_digits(int digits[]){
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        digits= new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
    // static void print(int digits[]){
    //     for(int a:digits){
    //         System.out.println(a);
    //     }
    // }
}
