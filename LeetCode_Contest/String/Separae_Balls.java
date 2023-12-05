package LeetCode_Contest.String;

public class Separae_Balls {
    public static void main(String[] args) {
        System.out.println(Balls("101"));
    }

    static int Balls(String s){
        int a=0;
        int p=s.length()-1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                a=p-i;
                p--;
            }
        }
        return a;
    }
}
