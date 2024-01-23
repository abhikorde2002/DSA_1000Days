package Array.Advance_Array;

import java.util.Arrays;

public class K_thElement {
    public static void main(String[] args) {
        int arr1[]={2, 3, 6, 7, 9};
        int arr[]={1, 4, 8, 10};
        System.out.println(kthElement(arr1, arr, 5));
    }

    public static int  kthElement( int arr1[], int arr2[],int k) {
        int arr[]=new int [arr1.length+arr2.length];
        int i=0;
        int ans=0;
        while (i<arr1.length) {
            arr[i]=arr1[i];
            i++;
            ans=i;
            System.out.println(arr[i]);
            System.out.println(arr1[i]);
        }
        System.out.println(ans);
        while (ans<arr2.length) {
            arr[ans]=arr2[ans];
            i++;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr[k-1];

    }
}
