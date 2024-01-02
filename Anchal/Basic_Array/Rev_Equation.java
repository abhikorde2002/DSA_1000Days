package Anchal.Basic_Array;

public class Rev_Equation {
    public static void main(String[] args) {
        System.out.println(reverseEqn("20-3+5*2"));
    }

    static String reverseEqn(String s)
    { 
        // your code here
        String str="";
        StringBuilder st= new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
              if (Character.isDigit(s.charAt(i))){
                 str= s.charAt(i)+str;
                 
              }else{
                st.append(str);
                st.append(s.charAt(i));
                str="";
               // str= s.charAt(i)+str;
              }
        }
        st.append(str);
        return st.toString();
    }
}

//    if(i>0  &&Character.isLetter(s.charAt(i-1))){
        //         str+= s.charAt(i-1);
        //         str+=str.charAt(i);
        //         i--;
        //     }else{
        //     str+=s.charAt(i);
        // }
    //     for(int i=0;i<s.length();i++){
    //         if(i<=s.length()-1 && Character.isLetter(i+1)){
    //             str+=s.charAt(i);
    //             str+=s.charAt(i+1);
    //             i++;
    //         }
    //         else{
    //          str=s.charAt(i)+str;
    //     }
   //  }
