package Array.Day_30;

public class Tru {
    public static void main(String[] args) {
        
    }
        
      
    public int[] findIndices(int[] arr, int indexDifference, int valueDifference) {
        int ans[]={-1,-1};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(Math.abs(i-j)>=indexDifference && Math.abs(arr[i]-arr[j])>=valueDifference){
                    
                        ans[0]=i;
                        ans[1]=j;
                   
                }
            }
        }
        return ans;
    }
}
