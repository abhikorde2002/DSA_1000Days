package Array.Day_27;

public class Nth_Root {
    public static void main(String[] args) {
        int a=3;
        int b=27;
        //  System.out.println((int)Math.pow(a,3 ));
        System.out.println(Search(a, b));
        System.out.println(binary(a, b));
        System.out.println(Sample(a, b));
    }

    
    static int Search(int a,int b){
       for(int i=0;i<=b/2;i++){
        if((Math.pow(i,a))==b){
            return i;
        }
       }
       return -1;
    }
    static int binary(int a,int b){
        int start=0;
        int end=b;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(Math.pow(mid,a )==b){
                ans=mid;
                break;
            }
            else if(Math.pow(mid, a)>b){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    static int Sample(int a,int b){
        int start=0;
        int end=b;
        while(start<=end){
            int mid=start +(end-start)/2;
            int mids=loops(mid,a,b);
            if(mids==1){
                return mid;
            }
            if(mids==0){
                start=mid+1;
            }
            else{
                end=mid-1;
            }  
        }
        return -1;
    }
    static int loops(int mid,int a,int b){
        long ans=1;
        for(int i=1;i<=a;i++){
            ans=ans*mid;
            if(ans>b){
                return 2;
            }
        }
        if(ans==b){
            return 1;
        }
        return 0;
    }
}
