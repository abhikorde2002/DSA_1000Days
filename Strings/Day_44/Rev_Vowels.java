package Strings.Day_44;

public class Rev_Vowels {
    public static void main(String[] args) {
        String str="hello";
         String sb="aeiouAEIOU";
        System.out.println(Vowels(str,sb));
       
    }

    static String Vowels(String str,String sb){
        
        int start=0;
        char ch[]=str.toCharArray();
        int end=str.length()-1;
        while (start<end) {
            while (start<end && sb.indexOf(ch[start])==-1) {
                start++;
            }
            while (start<end && sb.indexOf(ch[end])==-1) {
                end--;
            }
         
                char tem=ch[start];
                ch[start]=ch[end];
                ch[end]=tem;
           start++;
           end--;
        }
        String s= new String(ch);
        return s;
    }
}
