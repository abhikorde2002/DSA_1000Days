package Recursion.Middle_Rec;

public class Remove_Char {
    public static void main(String[] args) {
        String s="appleA";
        char ch= 'A';
        //System.out.println(Remove(s, ch));
        Removes("", s);
        System.out.println(Skipe(s));
        System.out.println(SkipeAppnotApple(s));
    }

    static String Remove(String str,char ch){
        
        StringBuilder s= new StringBuilder("");
        return Value(str, ch, s,0).toString();

    }
    static StringBuilder Value(String str,char ch,StringBuilder s,int i){
         if(i==str.length()){
            return s;
         }
         if(str.charAt(i)!=ch){
            s.append(str.charAt(i));
         }
         return Value(str, ch, s, i+1);
    }


    static void Removes(String p,String str){
        if(str.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=str.charAt(0);
        if(ch=='A'){
            Removes(p, str.substring(1));
        }
        else{
            Removes(p+ch, str.substring(1));
        }
    }
    static String Skipe(String str){
        if(str.isEmpty()){
            return "";
        }
    
        if( str.startsWith("apple")){
          return Skipe(str.substring(5));
        }
        else{
           return str.charAt(0)+ Skipe(str.substring(1));
        }
    }

    static String SkipeAppnotApple(String str){
        if(str.isEmpty()){
            return "";
        }
    
        if(str.startsWith("app")&& !str.startsWith("apple")){
          return SkipeAppnotApple(str.substring(3));
        }
        else{
           return str.charAt(0)+ SkipeAppnotApple(str.substring(1));
        }
    }
}
