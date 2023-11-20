package Strings.Day_41;

public class Int_Roman {
    public static void main(String[] args) {
        System.out.println(Int(3));
    }

    static String Int(int num){
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder str= new StringBuilder();
        int i=0;
        while(num>0){
            if(num>=values[i]){
                str.append(romanNumerals[i]);
                num-=values[i];
            }
            else{
                i++;
            }
        }
         return str.toString();
    }
}
