package Strings.Day_40;

public class isomorphic {
    public static void main(String[] args) {
        String s="egg";
        String str="ad";
        System.out.println(Iso("egg"));
        System.out.println(Iso("Egg"));
        System.out.println(s.length());
        System.out.println(search(s, str));
    }

    static boolean search(String s,String str){
        if(s.length()!=str.length()){
            return false;
        }
        
        String start=Iso(s);
        String end=Iso(str);
        int cout=0;
        for(int i=0;i<s.length();i++){
            if(start.charAt(i)==end.charAt(i)){
                cout++;
            }
        }
       
        return cout==s.length() ? true: false;
    }
    static String Iso(String s){
     
        String str="";
            
        for(int i=0;i<s.length();i++){
            int cout=1;
            if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                cout++;
            }
            str+= cout;
        }
        return str;
    }
}
