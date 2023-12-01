package Strings.Day_40;

public class String_Int {
    public static void main(String[] args) {
        String s="42";
        int digit=s.charAt(0)-'0';
        System.out.println(digit);
        
      //  System.out.println(Int(s));
      //  StrToInt(s);
        System.out.println(myAtoi(s));
    }
    
    // static void StrToInt(String str){
    //     str=str.trim();
    //     char [] ch= {'0','1','2','3','4','5','6','7','8','9'};
    //     // int num[]={0,1,2,3,4,5,6,7,8,9};
    //     int a=0;
    //     int i=0;
    //     int j=0;
    //     while (i<str.length()) {
    //         if(str.charAt(i)==ch[j]){
                
    //             i++;
    //             a=j;
    //             j=0;
    //             System.out.print(a);
    //         }
    //         if(str.charAt(i)=='-' || str.charAt(i)=='+'){
    //             System.out.println(str.charAt(i));
    //         }
    //         else{
    //             j++;
    //         }
    //     }
     

    // }
    public static  int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        
        int multiplier = 1;
        int index = 0;
        char firstChar = s.charAt(0);

        if (firstChar == '-' || firstChar == '+') {
            if (firstChar == '-') {
                multiplier = -1;
            }
            index++;
        }

        int num = 0;
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';
            System.out.println(digit);
            // Checking for overflow and underflow
            if (multiplier == 1 && (num > Integer.MAX_VALUE/10 || (num == Integer.MAX_VALUE/10 && digit >= 7))) {
                return Integer.MAX_VALUE;
            }
            if (multiplier == -1 && (num < Integer.MIN_VALUE/10 || (num == Integer.MIN_VALUE/10 && digit >= 8))) {
                return Integer.MIN_VALUE;
            }
            
            num = num * 10 + digit * multiplier;
            index++;
        }
        
        return num;
    }
   
   
}
