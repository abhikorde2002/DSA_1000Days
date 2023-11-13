package Strings.Day_39;

public class Firs_String {
    public static void main(String[] args) {
        String s="sad";
        String str="sad";
        System.out.println(Find_Index(s, str));
    }
//     static int Find(String s,String str){
//       int ans=-1;
//       int cou=0;
//       for(int i=0;i<str.length();i++){
//         for(int j=0;j<s.length();j++){
//             if(s.charAt(j)==str.charAt(i)){
//                 cou++;
//                 break;
//             }    
//           if(cou==str.length()-1){
//              ans=j-cou+1;
//             }
//              else if(s.charAt(j)!= str.charAt(i)){
//                cou=0;
//             }
//             //  else{
//             //     cou=0;
//             // }
//         }
//     }
      
//        return ans ;
//   //  return s.indexOf(str);
//     }
    static int Find_Index(String arr,String num){
        int a=arr.length();
        int b=num.length();
        for(int i=0;i<=a-b;i++){
            int j=0;
            while(j<b && arr.charAt(i+j)==num.charAt(j)){
                j++;
                if(j==b){
                    return i;
                }
            }
        }
        return -1;
    }

}
