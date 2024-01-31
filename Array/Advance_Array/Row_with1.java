package Array.Advance_Array;

public class Row_with1 {
    public static void main(String[] args) {
        int arr[][]={{0,1,1,1 }, {1,1,1,0} , {1,1,1,1} , {0, 0, 0, 0}};
        int max[][]={{0,0},{1,1}};
        System.out.println(Matrix(max));
        System.out.println(Tryle(arr, 4, 4));
    }

    static int Matrix(int arr[][]){
        int top = 0;
        int bottom = arr.length-1;
        int left = 0;
        int right = arr[0].length-1;
        int max=0;
        int ans=0;
        while (true) {
            int cou=0;
            
            for(int i=left;i<=right;i++){
                if(arr[top][i]==1){ cou++;
                }
               // System.out.println(cou);
            }
            //System.out.println(top);
            top++;
            if(max<cou){max=cou; ans=top; }
        // System.out.println(ans);
            if(top>bottom){ break;}
        }
        return max==0 ? -1 : ans-1;
    }

    static int Tryle(int arr[][],int n,int m){
        int ans=n;
        int i=n-1, j=m-1;
        while(i>=0){
            if(arr[i][j]==1){
                if(j-1>=0 && arr[i][j-1]==1 ){
                    j--;
                }
                else{
                    
                    ans=Math.min(ans,i);
                    i--;
                }
            }
            else{i--;
        }
     }
     return ans==n ?-1 : ans;
    }
}
