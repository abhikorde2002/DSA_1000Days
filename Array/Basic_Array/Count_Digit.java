package Array.Basic_Array;

public class Count_Digit {
    public static void main(String[] args) {
        System.out.println(evenlyDivides(23));
        char c='a';
        if(Character.isLetter(c)){
            System.out.println("Hi");
        }
       
        // boolean t=  CharSequence.isLetter('+');
    }

    static int evenlyDivides(int n){
        // code here
        int cou=0;
        int a=n;
        while(n>0){
            int dig= n%10;
            int rem= a/dig;
          //  System.out.println(rem);
            if(rem%2==0){
                cou++;
            }
            n= n/10;
        }
        return cou;
    }
   
}
