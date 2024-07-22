package Complete_Heap.MAX_Heap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Replace_Element {
    public static void main(String[] args) {
        int arr[]={20, 15, 26, 2, 98, 6};
        int sum[]=Arrays.copyOf(arr, arr.length);
         Arrays.sort(sum);
        //  System.out.println(Arrays.toString(sum));
        System.out.println(Arrays.toString(replaceWithRank(arr, sum, arr.length)));
    }
    static int[] replaceWithRank(int arr[], int N) {
        // code here
   int num[]=Arrays.copyOf(arr, arr.length);
           Arrays.sort(num);
          Map<Integer,Integer> map= new HashMap<>();
          int ind=1;
          for(int i=0;i<num.length;i++){
              if(map.containsKey(num[i])){
                 continue;
              }
              else{
              map.put(num[i], ind++);
              }
          }
          int a[]= new int[arr.length];
          int b=0;
          for (int i = 0; i < arr.length; i++) {
           if(map.containsKey(arr[i])){
               a[b++]=map.get(arr[i]);
           }
          }
          return a;
        }
    static int[] replaceWithRank(int arr[],int sum[], int N) {
       int num[]= new int[arr.length];
       int ind=0;
       for(int i=0;i<arr.length;i++){
        int tar=i;
        int left=0;
        int right=sum.length-1;
        while (left<=right) {
            int mid= left + (right-left)/2;

            if(sum[mid]==arr[tar]){
                if(mid+1<sum.length  &&  sum[mid+1]==arr[tar]){
                    
                    num[ind++]=mid+1;
                    break;
                }
                else{
                    if(mid==0){
                        num[ind++]=mid+1;
                        break;
                    }
                    // if(mid==1){

                    // }
                    else{
                    num[ind++]=mid;
                    break;
                    }
                }
            }
            if(sum[mid]<arr[tar]){
                left=mid+1;

            }
            else{
                right=mid-1;
            }
        }

       }

       return num;

    } 
}
