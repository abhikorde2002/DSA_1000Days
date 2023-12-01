package Contest.String;

public class Tree_Equal {
    public static void main(String[] args) {
        String s="abc",str="abb",j="ab";
        System.out.println(Equal(s, str, j));
        
    }
    static int Equal(String s,String str,String j){
        int a=0;
        for(int i=0;i<s.length() && i<str.length() && i<j.length();i++){
            if(s.charAt(i)== str.charAt(i) && str.charAt(i)==j.charAt(i)){
                a++;
            }
            else{
                break;
            }
        }
        return s.length()+str.length()+j.length()-3*a;
    }
}
