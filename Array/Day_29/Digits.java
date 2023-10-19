package Array.Day_29;
/*Input: n = 10, m = 3
Output: 19
Explanation: In the given example:
- Integers in the range [1, 10] that are not divisible by 3 are [1,2,4,5,7,8,10], num1 is the sum of those integers = 37.
- Integers in the range [1, 10] that are divisible by 3 are [3,6,9], num2 is the sum of those integers = 18.
We return 37 - 18 = 19 as the answer. */
public class Digits {
    public static void main(String[] args) {
        System.out.println(Digits(10, 3));
    }

    static int Digits(int n,int m){
        int sum=0;
        int ans=0;
        for(int i=1;i<=n;i++){
            if(i%m!=0){
                sum+=i;
            }
            else{
                ans+=i;
            }
        }
        int diff=sum-ans;
     return diff;
    }

}
