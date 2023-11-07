package Strings.Day_37;

public class Edit_Dis {
    public static void main(String[] args) {
        String s="geek";
        String t="gesek";
        Distance(s, t);
    }
    

    static void Distance(String s, String t){
      int count=0;
      for(int i=0;i<t.length();i++){
          for(int j=0;j<s.length();j++){
              if(t.charAt(i)!=s.charAt(j)){
                  count++;
                  break;
                  
              }
              // else{
                  
              //     break;
              // }
          }
      }
        System.out.println(count);
    }
}
//   if(t.charAt(i)==s.charAt(i)){
//                  continue;
//             }
//             else{
//                 count++;
                
//             }
