package Greed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Non_overlaping_interval {
    public static void main(String[] args) {
        int arr[][]={{1,2},{1,2},{1,2}};
        System.out.println(maxMeetings(arr.length, arr));
    }

    static  int maxMeetings(int n, int start[][]) {
        int cou=0;
       List<int[]> list= new ArrayList<>();
       for (int i = 0; i < n; i++) {
            list.add(start[i]);
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
            while (i<n && list.get(i)[0]<limit) {
                System.out.println(list.get(i)[0]);
                i++;
            }
       }
       System.out.println(list.get(1)[0]);
       return Math.abs(start.length-cou);

    }
}













