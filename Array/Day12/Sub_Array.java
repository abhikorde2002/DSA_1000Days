package Array.Day12;

import java.util.Arrays;

public class Sub_Array {
    public static void main(String[] args) {
        int  a1[] = {11,1, 7, 13, 21, 3, 7, 3};
        int a2[] = {11, 1, 1, 7};
        System.out.println(isSub(a1, a2, 8, 4));
    }

    static String isSub(int arr[],int num[],int n,int m){
        Arrays.sort(arr);
        Arrays.sort(num);
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=i;j<n;j++){
                if(arr[i]==num[j]){
                    count++;
                }

            }
        }
        if(count==m)return "Yes";
        return "No";
    }
}
