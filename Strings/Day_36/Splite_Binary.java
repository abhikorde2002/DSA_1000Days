package Strings.Day_36;

public class Splite_Binary {
    public static void main(String[] args) {
        String s="0100110101";
        System.out.println(Split(s));
    }

    static int Split(String s){
        int count=0;
        int start=0,end=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) =='0'){
              start++;
            }
            else if(s.charAt(i)=='1'){
                end++;
            }
            if(start>=1 && end>=1 && start==end ){
                count++;
            }
        }
        if(start!=end)return -1;
        return count;
    }
}
