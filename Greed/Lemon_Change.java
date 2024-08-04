package Greed;

public class Lemon_Change {
    public static void main(String[] args) {
        int arr[]={5,5,10,10,20};
        System.out.println(lemonadeChange(arr));
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
