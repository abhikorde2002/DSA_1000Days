package Array.Day15;

public class Squar {
    public static void main(String[] args) {
    //     int x=8;
    //        
    System.out.println(bineary(8));
    }
    static void square(int x){
         double arr=(double)x;
        arr=Math.floor(Math.sqrt(x));
       int sum=(int)arr;
       System.out.println(sum); 
    }

    static int bineary(int x){
        int start=0;
        int end=x;
        while(start<=end){
            int mid=start + (end-start)/2;
            
            if((mid*mid)==x){
                return mid;
            }
            if( (mid* mid) >  x){
                end=mid-1;
            }
            else if((mid*mid)<x){
                start = mid+1;
            }
        }
        return end;
    }
}
