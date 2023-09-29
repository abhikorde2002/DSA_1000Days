package Array.Day_22;

public class Sum_square {
    public static void main(String[] args) {
        long  c=5;
        System.out.println((long)Math.sqrt(c));
        System.out.println(binary(c));

    }
    
  
   static boolean binary(long c){
    for(long i=0;i*i<=c;i++){
        long a=c-i*i;
        System.out.println(a);
        boolean isSquare= search(0,a,a);
        if(isSquare)return true;
     }
     return false;
   }
  static boolean search(long start,long end,long target){
     while(start<=end){
         long mid= start+ (end-start)/2;
         if(mid*mid == target)return true;
         System.out.println(mid);
         if(mid*mid > target) end=mid-1;
         else start=mid+1;
     }
     return false;
 }

    
}
