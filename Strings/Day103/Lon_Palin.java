package Strings.Day103;

public class Lon_Palin {
    public static void main(String[] args) {
        String s="babad";
        System.out.println(longesString(s));
    }

    static String longesString(String s){
        if(s.length()==1){
            return s;
        }
        String max="";
        for (int i = 0; i < s.length()-1; i++) {
            String odd=find(s,i,i);
            String even=find(s, i, i+1);
            if(odd.length()>max.length()){
                max=odd;
            }
            if (even.length() > max.length()) {
                max=even;
            }
        }
        return max;
    }

     static String find(String s, int left, int right) {
        while (left>=0 && right<s.length() && s.charAt(right)==s.charAt(left)) {
            left--;
            right++;
        }
        return s.substring(left+1, right);
    }
}
