package Array.Day_30;

public class Shortest {
    public static void main(String[] args) {
       String s = "100011001";
       System.out.println(shortestBeautifulSubstring(s, 3)); 
    }
    public static String shortestBeautifulSubstring(String s, int k) {
        String str="";
        int start=0;
        for(int i=0;i<s.length();i++){
             int count=0;
            for(int j=i;j<=s.length()-1;j++){
                 str+=s.charAt(j);
                if(s.charAt(j)=='1'){
                    count++;
                }
            }
            if(count==k){
               return str;
            }
            else{
                str="";
            }
        }
        return str;
    }
}
