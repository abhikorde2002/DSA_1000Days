package Array.Day_2;

public class Traping_Rain {
    public static void main(String[] args) {
        int num[]={4,2,0,6,3,2,5};
        Trapping_Rain(num);
    }

    static void Trapping_Rain(int num[]){
        int n= num.length;

        //calculate leftmax
        int leftMax[]= new int[n];
        leftMax[0]=num[0];
        
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],num[i]);
        }

        //calculate rightMax
        int rightMax[]= new int[n];
        rightMax[n-1]=num[n-1];

        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1], num[i]);
        }

        int trapping=0;

        for(int i=0;i<n;i++){
            int WaterLevel = Math.min(leftMax[i],rightMax[i]);
          trapping += WaterLevel-num[i];
        }
       System.out.println(trapping);
    }
}
