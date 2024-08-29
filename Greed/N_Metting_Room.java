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
      int arr[]={48 ,43 ,61, 54 ,99, 84, 3 ,3 ,59 ,30, 45 ,72, 24 ,87, 21, 48, 54, 88, 8, 67 ,41 ,64 ,87, 54, 5 ,62, 87 ,33, 74, 92};
      int num[]={150 ,67, 137, 131, 139 ,115 ,49, 6 ,117, 126, 59 ,109, 27, 96, 73, 60, 99, 108, 50, 145, 68 ,104 ,102, 82 ,7, 126 ,118, 93, 148, 150};
      System.out.println(maxMeetings(30, arr, num));  
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
