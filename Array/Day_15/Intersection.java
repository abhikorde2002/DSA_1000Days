package Array.Day_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection {
    public static void main(String[] args) {
        int arr[]={1,2,2,1};
        int num[]={2,2};
        System.out.println(intersection(num, num));
        intersections(num, num);
        System.out.println(Arrays.toString(intersect(num, num)));
    }
    public static List<Integer> intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }
        
        set1.retainAll(set2);
        
        return new ArrayList<>(set1);
    }
    public static void intersections(int[] num, int[] num2) {
        Set<Integer> sh= new HashSet<>();
        for(int i:num){
            sh.add(i);
        }
         Set<Integer> sh1= new HashSet<>();
        for(int a:num2){
            sh1.add(a);
        }
        sh.retainAll(sh1);
        System.out.println(sh);
    }
    public static int[] intersect(int[] num, int[] num2) {
          
        Set<Integer> sh= new HashSet<>();
        for(int i:num){
            sh.add(i);
        }
         ArrayList<Integer> sh1= new ArrayList<>();
        for(int a:num2){
            sh1.add(a);
        }
        sh.retainAll(sh1);
        int resile[]=new int[sh.size()];
        int ind=0;
        for(int c:sh){
             resile[ind++]=c;
        }
      return resile; 
    
    }
}
