package Greed;

public class Lemon_Change {
    public static void main(String[] args) {
        int arr[]={5,5,5,10,20};
        System.out.println(lemonadeChange(arr));
        System.out.println(lemon(arr));
    }
   static boolean lemon(int arr[]){
      if(arr[0]>5){
        return false;
      }
      int five=0;
      int ten=0;
      for (int i = 0; i < arr.length; i++) {
        if(arr[i]==5){
            five++;
        }
        else if(arr[i]==10){
            ten++;
            five--;
        }
        else{ 
            if(ten!=0 ){
            five--;
            ten--;
          
        }
    }
        if(ten==0 && five==0 ){
            return false;
        }

      }
      return true;
   }


    static boolean lemonadeChange(int[] bills) {
        if (bills[0]>5) {
            return false;
        }
        int five=0;
        int ten=0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i]==5) {
                five+=1;
            }
            else if (bills[i]==10) {
                ten++;
                five--;
                
            }
            else{
                if (ten>0) {
                    ten--;
                    five--;
                }
                five=five-3;
            }
            if(five<0 || ten<0){
                return false;
            }
        }
        return true;
    }
}
