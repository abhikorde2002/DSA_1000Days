package Greed;

import java.util.Arrays;

public class DI_String {
    public static void main(String[] args) {
        String s="III";
        System.out.println(Arrays.toString(diStringMatch(s)));
        String str="Thursday, August 01, 2024";
        System.out.println(str.split(",").equals("Thursday"));
    }

    public static int[] diStringMatch(String s) {
        int is=0;
        int d=s.length();
        int arr[]= new int[s.length()+1];
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='I')arr[i]=is++;
            if(s.charAt(i)=='D'){
                arr[i]=d--;
            }
        }
         if(s.charAt(s.length()-1)=='D'){
            arr[s.length()]=d--;
        }
        if(s.charAt(s.length()-1)=='I'){
            arr[s.length()]=is++;
        }
        return arr;
    }
}
