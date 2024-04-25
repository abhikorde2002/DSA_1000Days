package Strings.Day100;

public class Rev_Word {
    public static void main(String[] args) {
        String s="i.like.this.program.very.much";
        System.out.println(Reverse(s));
    }

    static String Reverse(String S)
    {
        // code here 
        String str[]=S.split("\\.");
        String s="";
        for(int i=str.length-1;i>=0;i--){
            s+=str[i];
            if(i!=0){
                s+=".";
            }
        }
        return s;
    }
}
