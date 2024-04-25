package Recursion.Middle_Rec;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
    //     permutations("", "abc");
    //     System.out.println();
  //  permutations("", "123");
    int arr[]={1,2,3};
    System.out.println(Print(arr));
   // System.out.println(permutationsCount("", "abc"));
    }

    static List<List<Integer>> Print(int arr[]){
        List<List<Integer>> ans= new ArrayList<>();
      
          permutarray( arr, ans, new ArrayList<>());
        return ans;  
    }

    static void permutarray(int arr[],List<List<Integer>> ans, List<Integer> per){
        if(per.size()==arr.length){
            ans.add(new ArrayList<>(per));
            return;
        }

        for (int i : arr) {
            if (per.contains(i)) 
                continue;
            
            per.add(i);

            permutarray( arr, ans, per);
           
           per.remove(per.size()-1);
        }
      
    }

    static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1));
        }
    }
    static int permutationsCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int cou=0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            cou+= permutationsCount(f + ch + s, up.substring(1));
        }

        return cou;
    }
    static ArrayList<String> permutationsList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> str=new ArrayList<>();
            str.add(p);
            return str;
        }
        ArrayList<String> ans= new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationsList(f + ch + s, up.substring(1)));
        }
        return ans;
    }
}
