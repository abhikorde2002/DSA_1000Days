package Strings.Day_43;

public class Num_seg {
    public static void main(String[] args) {
        String s=", , , ,        a, eaefa";
        System.out.println(countSegment(s));
    }

    static int countSegment(String str){
        int count=1;
        str=str.trim();
        if(str.isEmpty()){
            return 0;
        }
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                count++;
            }
        }
        return count;
    }
}
