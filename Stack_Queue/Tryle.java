package Stack_Queue;

public class Tryle {
    public static void main(String[] args) {
        String remove= "\"Hello";
        CharSequence c="\"";
        String s="";
        for (int i=0;i<remove.length();i++){
            if(!remove.contains(c)){
                 s+=remove.charAt(i);
        }
        }
        System.out.println(s);
    }
}
