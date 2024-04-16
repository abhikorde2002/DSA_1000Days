package Sliding_Two_Pointer;

public class Max_Consicutiveone {
    public static void main(String[] args) {
        int arr[]={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
      //  System.out.println(longest(arr, 3));
      System.out.println(Optimal(arr, 3));
    }


    //time complexity : o(n)
    static int Optimal(int arr[],int k){
        int max=Integer.MIN_VALUE;
        int left=0,right=0;
        int zero=0;
        while (right<arr.length) {
             if(arr[right]==0){
                zero++;
             }
             if (zero>k) {   
              if(arr[left]==0){
                zero--;
              }
              left++;  
             }
          
             max=Math.max(max, right-left+1);
             
             right++;
        }
        return max;
    }

    static int longest(int arr[],int k){
        int max=Integer.MIN_VALUE;
     
        for (int i = 0; i < arr.length; i++) {
            int cou=0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j]==0) {
                  cou++;  
                }
                else if(cou<=k){
                    max=Math.max(max, j-i+1);
                }
                else{
                    break;
                }
            }
        }
        return max;
    } 

    //Time complexity : - O(n) + O(n)
    static int longestone(int arr[],int k){
        int max=Integer.MIN_VALUE;
        int left=0,right=0;
        int zero=0;
        while (right<arr.length) {
             if(arr[right]==0){
                zero++;
             }
             while (zero>k) {
                
              if(arr[left]==0){
                zero--;
              }
              left++;  
             }
             max=Math.max(max, right-left+1);
             right++;
        }
        return max;
    }
}
