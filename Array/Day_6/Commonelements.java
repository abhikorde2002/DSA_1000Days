package Array.Day_6;

import java.util.ArrayList;

public class Commonelements {
    public static void main(String[] args) {
         int ar1[] = { 1, 5, 10, 20, 40, 80 };
        int ar2[] = { 6, 7, 20, 80, 100 };
        int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };
        common(ar1, ar2, ar3);
    }

    static void  common(int arr[],int num[],int comm[]){
        int n=arr.length;
        int n1=num.length;
        int n2=comm.length;

        int i=0,j=0,k=0;
        while(i<n && j<n1 && k<n2){
            if(arr[i]==num[j] && num[j]==comm[k]){
                
                System.out.println(arr[i]+" ");
                i++;
                j++;
                k++;

            }
            else if(arr[i]<num[j]){
                i++;
            }
            else if(num[j]<comm[k]){
                j++;
            }
            else{
                k++;
            }
        }
        
    }

     ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        ArrayList<Integer> common = new ArrayList<>();
        int i=0,j=0,k=0;
        while(i<n1 && j<n2 && k<n3){
            if(A[i] == B[j] && B[j]==C[k]){
               if(!common.contains(A[i])){
                    common.add(A[i]);
            }
                i++;
                j++;
                k++;
            }
            else if(A[i]<B[j]){
                i++;
            }
            else if(B[j]<C[k]){
                j++;
            }
            else{
                k++;
            }
        }
        return common;
    }
}
