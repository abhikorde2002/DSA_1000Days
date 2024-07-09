package Complete_Heap.MAX_Heap;


/*
  Input:
n = 6
arr[] = {90, 15, 10, 7, 12, 2}
Output: 
1
Explanation: 
The given array represents below tree
       90
     /    \
   15      10
  /  \     /
7    12  2
The tree follows max-heap property as every
node is greater than all of its descendants.
 */
public class Does_Array_Heap {
   public static void main(String[] args) {
    long arr[]={90, 15, 10, 7, 12, 2};
    System.out.println(countSub(arr, arr.length));
   }
   
   
   public static boolean countSub(long arr[], long n)
    {
        // Your code goes here
        for(int i=0;i<arr.length;i++){
            int left=2*i+1;
            int right=2*i+2;
            if(left<arr.length && arr[left]>arr[i])return false;
            if(right<arr.length && arr[right]>arr[i])return false;
        }
        return true;
        
    }
}
