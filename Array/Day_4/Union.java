package Array.Day_4;

import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
        int num[]={10,20,30};
        int arr[]={30,40,50};
        union(num, arr, num.length, arr.length);
    }

    static void union(int num[],int arr[],int n, int m){
        // int count=0;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(num[i]!=arr[j]){
                    
        //         }
                
        //     }
           
        // }
        // System.out.println(count);

        HashSet<Integer> has=new HashSet<>();
        for(int i=0;i<n;i++){
            has.add(num[i]);
        }
        for(int i=0;i<m;i++){
            has.add(arr[i]);
        }
        System.out.println(has.size());
    }
}
