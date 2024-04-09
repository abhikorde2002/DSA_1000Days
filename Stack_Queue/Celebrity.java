package Stack_Queue;

public class Celebrity {
    public static void main(String[] args) {
        int arr[][]={{0, 1,0},
        {0,0, 0},{0, 1,0}};
      //  System.out.println(Anser(arr, 3));
      System.out.println(celebrity(arr, arr.length));
    }

    static int celebrity(int arr[][], int n)
    {
    	// code here 
    	
        int c=0;
        for(int i=1;i<arr.length;i++){
            if(arr[c][i]==1) c=i;
            
            }

            System.out.println(c);
        for(int i=0;i<n;i++){
            if(i!=c && (arr[c][i]==1)|| arr[i][c]==0)return -1;
        }    
            
        
        return c;
    	
    }

    static int Anser(int M[][],int n){
        int ans=-1;
        for(int i=0; i<n; i++)
        {
            int ct1=0;
            int ct2=0;
            for(int j=0; j<n; j++)
            {
                if(i==j)
                {
                    continue;
                }
                if(M[i][j]==1)
                {
                    ct1++;
                }
                if(M[j][i]==1)
                {
                    ct2++;
                }
                
            }
            if(ct1==0 && ct2==n-1)
            {
                ans= i;
            }
        }
        return ans;
    }
}
