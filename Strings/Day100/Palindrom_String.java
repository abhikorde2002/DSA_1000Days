package Strings.Day100;

public class Palindrom_String {
    public static void main(String[] args) {
        String s="abc";
        System.out.println(isPalindrom(s));

    }

    static int isPalindrom(String x){
        int left=0,right=x.length()-1;
        while (left<right) {
            if(x.charAt(left)!=x.charAt(right)){
                return 0;
            }
            left++;
            right--;
        }
        return 1;
    }
}
