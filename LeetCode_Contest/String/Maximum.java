package LeetCode_Contest.String;

public class Maximum {
    public static void main(String[] args) {
         System.out.println(maximumLength("aaaa"));
    }

    static int maximumLength(String str){
        int cou=0;
         int ans=Integer.MIN_VALUE;
        for(int i=0;i<str.length();i++){
            
            for(int j=i;j<str.length();j++){
                int start=j ,end=j+1;
                int k=1;
                if(pri(str, i, j)==1  && pri(str, j, i)<=str.length()/2){
                    
                 while (start<str.length() && end<str.length()-1 ) {
                     if(k==3){
                        if ((j-i)+1 >ans){
                            ans=(j-i)+1;
                        }
                     }
                     if(str.charAt(start)==str.charAt(end)){
                        start=end;
                        end++;
                        k++;
                     }
                 }
                
                }
            }
           
        }
        return ans;
    }

    static int pri(String str,int s,int e){
        while (s<e ) {
            if(str.charAt(s)!=str.charAt(e))return -1;
            s++;
            e++;
        }
        return 1;
    }
}
