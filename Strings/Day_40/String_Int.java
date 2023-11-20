package Strings.Day_40;

public class String_Int {
    public static void main(String[] args) {
        String s="42";
        System.out.println(Int(s));
    }

    static int Int(String s){
        int a=0;
        int b=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<=10;j++){
                System.out.println(j);
                System.out.println(s.charAt(i));
                if(j==s.charAt(i)){
                    System.out.println(s.charAt(i));
                      a=j;
                      break;
                }
            }
            b=a;
        }
        return a;
    }
}
