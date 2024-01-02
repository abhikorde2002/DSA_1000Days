package Linked_List.Quesions;

public class Happy_Number {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
    public static int find(int n){
        int sum = 0;
        while(n != 0){
            int digit = n % 10;
            n = n / 10;
            sum += digit * digit;
        }
        return sum;
    }
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            fast = find(find(fast));
            slow = find(slow);
        }while(slow != fast);
        return slow == 1;
        
    }
}
