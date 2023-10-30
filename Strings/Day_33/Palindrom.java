package Strings.Day_33;

public class Palindrom {
    public static void main(String[] args) {
        Pali("abba");
    }

    static void Pali(String s){
        int a=0;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                a++;
                break;
            }
        }
        System.out.println((a==1)? "Not Palindrom":"Palindrom");
    }
}
