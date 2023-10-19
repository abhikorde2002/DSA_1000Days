package Array.Day_31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Book_Alocation {
    public static void main(String[] args) {
        int arr[]={15, 10, 19, 10, 5 ,18, 7};
        System.out.println(findPages(arr,7, 5));
         ArrayList<Integer> arrs = new ArrayList<>(Arrays.asList(15, 10, 19, 10, 5 ,18, 7));
         int n = 5;
         int m = 4;
         int ans= find(arrs, n, m);
         System.out.println("The ans is: " + ans);
        }

        public static int findPages(int[]arr,int N,int student)
        {
            //Your code here
            if(student>arr.length){
                return -1;
            }
            int sum=0;
            int maxs=Integer.MIN_VALUE;
            for(int i:arr){
                maxs=Math.max(maxs, i);
                sum+=i;
            }
            for(int i=maxs;i<=sum;i++){
                if(posibls(arr, i)==student){
                    return i;
                }
            }
            return maxs;
        }
         static int posibls(int arr[],int page){
            int student=1;
            int pages=0;
            for(int i=0;i<arr.length;i++){
                 if(pages+arr[i]<=page){
                     pages+=arr[i];
                 }
                 else{
                    student++;
                    pages=arr[i];
                 }
            }
            return student;
        }

        static int count(ArrayList<Integer> arr,int pages){
            int n=arr.size();
            int student=1;
            long pagesStudent=0;
            for(int i=0;i<n;i++){
                if(pagesStudent+arr.get(i)<=pages){
                    pagesStudent+=arr.get(i);
                }
                else{
                 student++;
                 pagesStudent=arr.get(i);
                }
            }
            return student;
        }

        public static int find(ArrayList<Integer> arr,int n,int m){
            if(m>n){
                return -1;
            }
            int low=Collections.max(arr);
            int high=arr.stream().mapToInt(Integer::intValue).sum();

            for(int page=low;page<=high;page++){
                if(count(arr, page)==m){
                    return page;
                }
            }
            return low;
        }
    }

