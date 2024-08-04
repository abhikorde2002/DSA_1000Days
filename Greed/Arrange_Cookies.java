package Greed;

import java.util.Arrays;

public class Arrange_Cookies {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int num[]={1,2,2};
        System.out.println(findContentChildren(arr, num));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int left=0;
        int right=0;
        int cou=0;
        while (left!=g.length && right!=s.length) {
            if(g[left]<=s[right]){
                left++;
                right++;
                cou++;
            }else {
                right++;
            }
        }
        return cou;
    }
}
