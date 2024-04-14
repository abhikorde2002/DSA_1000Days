package Sliding_Two_Pointer;

public class Num_Sub {
    public static void main(String[] args) {
       String s= "abcabc";
       System.out.println(numberOfSubstrings(s)); 
    }

    public static int numberOfSubstrings(String s) {
       
        int cou=0;
        for (int i = 0; i < s.length(); i++) {
            int hash[]= new int[]{0,0,0};
            for (int j = i; j < s.length(); j++) {
                hash[s.charAt(j)-'a']=1;
               if(hash[0]+hash[1]+hash[2]==3){
                 cou=cou + (s.length()-j);
                break;
               }
            }

        }
        return cou;
    }
    public int number(String s) {
        int cou=0;
          int hash[]= new int[]{-1,-1,-1};
         for (int i = 0; i < s.length(); i++) { 
                 hash[s.charAt(i)-'a']=i;
                  cou=cou + 1+ Math.min(Math.min(hash[0],hash[1]),hash[2]);
                
             }
         return cou; 
     }
}
