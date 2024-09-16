package Greed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class N_Metting_Room {
    public static void main(String[] args) {
      int arr[]={1, 3, 0, 5, 8, 5};
      int num[]={2, 4, 6, 7, 9, 9};
     // System.out.println(maxMeetings(30, arr, num));  
     System.out.println(tryle(arr, num));
    }
    
    static int  tryle(int arr[],int sum[]){
        List<int[]> list= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(new int[]{arr[i],sum[i]});
            System.out.println(arr[i]+" "+sum[i]);
        }

        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int a[],int b[]){
                int compareEnd=Integer.compare(a[1], b[1]);
                if (compareEnd!=0) {
                    return compareEnd;
                }
                return Integer.compare(b[0], a[0]);
            }
        });
        System.out.println(list.get(0)[0]);
        int cou=0;
        for (int i = 0; i < list.size(); ) {
            int limit=list.get(i)[1];
            cou++;
            while (i<list.size() && list.get(i)[0]<=limit) {
                i++;
            }
        }
        return cou;
    }


    static  int maxMeetings(int n, int start[], int end[]) {
        int cou=0;
       List<int[]> list= new ArrayList<>();
       for (int i = 0; i < n; i++) {
            list.add(new int[]{start[i],end[i]});
       }
       Collections.sort(list,new Comparator<int[]>() {
        public int compare(int[] a, int[] b) {
            int compareEnd = Integer.compare(a[1], b[1]);
            if (compareEnd != 0) {
                return compareEnd;
            }
            return Integer.compare(b[0], a[0]);
        }
       });

       for (int i = 0; i < list.size(); ) {
            int limit=list.get(i)[1];
            cou++;
            while (i<n && list.get(i)[0]<=limit) {
                i++;
            }
       }
       return cou;

    }
}
