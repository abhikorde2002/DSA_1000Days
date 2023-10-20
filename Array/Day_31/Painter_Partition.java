package Array.Day_31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Painter_Partition {
    public static void main(String[] args) {
         ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10,20,30,40));
         int n = 5;
         int m = 2;
         int ans = findPages(arr, n, m);
         System.out.println("The answer is: " + ans);
        }

     public static int countStudents(ArrayList<Integer> arr, int pages) {
        int n = arr.size(); // size of array
        int students = 1;
        long pagesStudent = 0;
        for (int i = 0; i < n; i++) {
            if (pagesStudent + arr.get(i) <= pages) {
                // add pages to current student
                pagesStudent += arr.get(i);
            } else {
                // add pages to next student
                students++;
                pagesStudent = arr.get(i);
            }
        }
        return students;
    }

    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // book allocation impossible
        if (m > n)
            return -1;

        int low = Collections.max(arr);
        int high = arr.stream().mapToInt(Integer::intValue).sum();

        while(low<=high){
            int mid=low+(high-low)/2;
            int student=countStudents(arr, mid);
            if(student> m){
               low= mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}
