package Strings.Day_34;

public class Suffle {
    public static void main(String[] args) {
        String s = "codeleet";
        int arr[]={4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, arr));
    }
    public static String restoreString(String s, int[] indices) {
        int length=s.length();
       StringBuilder sb=new StringBuilder("");
        char c[]=new char[length];
      
       for(int i=0;i<length;i++){

           c[indices[i]]=s.charAt(i);

       }
       sb.append(c);
       return sb.toString();
   }
   static String suffle(String s,int arr[]){
    char ch[]=new char[s.length()];
    for(int i=0;i<s.length();i++){
        ch[arr[i]]=s.charAt(i);
    }
    return new String(ch);
   }
}
