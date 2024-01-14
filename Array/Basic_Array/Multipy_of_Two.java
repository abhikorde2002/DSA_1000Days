package Array.Basic_Array;

public class Multipy_of_Two {
    public static void main(String[] args) {
        System.out.println(multipy_OUT("0033", "2"));
    }

    static int multipy_OUT(String s,String str){
        int a=Integer.parseInt(str);
        int b=Integer.parseInt(s);
        
        int ans=a*b;
        return ans;
    }
}
