package Strings.Day_46;

public class Valid_Num {
    public static void main(String[] args) {
        String s=".1";
      //  StringBuilder str= new StringBuilder(s);
        char ch=s.charAt(0);
         if(!Character.isDigit(ch)){
          System.out.println(1);
         }
         System.out.println(isValidNumber(s));
    }
    static boolean isValidNumber(String str){
      if( (str.charAt(0)=='.' || str.charAt(0)=='e') && str.length()==1 ){
        return false;
      }
      int cou=0;
      for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        char c=str.charAt(i+1);
        if(i<str.length()   && (str.charAt(i)=='e' || str.charAt(i)=='E'&& !Character.isDigit(str.charAt(i+1))) ){
          return false;

        }
         if(i<str.length() && !Character.isDigit(ch) && !Character.isDigit(str.charAt(i+1))){
             return false;
        } else if( i<str.length() && str.charAt(i)=='.' && Character.isDigit(str.charAt(i+1))){
          continue;
        }
        else {
          return false;
        }
       
      }
      
      return true;
    }
}
