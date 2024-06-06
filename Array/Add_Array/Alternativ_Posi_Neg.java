package Array.Add_Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Alternativ_Posi_Neg {
    public static void main(String[] args) {
        int arr[]={-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
      String s="sdfsgdbgbs";
      System.out.println(s.substring(0, 8));
        rearrange(arr, 5);
    }

    static void  rearrange(int arr[], int n) {
      int start=0;
      int pos=1;
      ArrayList<Integer> s= new ArrayList<>();
      ArrayList<Integer> str= new ArrayList<>();
      for (int i = 0; i < arr.length; i++) {
        if(arr[i]>=0){
            s.add(arr[i]);
        }
       else{
        str.add(arr[i]);
       }
      }
      System.out.println(s);
      System.out.println(str);
     
      System.out.println(Arrays.toString(arr));
      for(int i=0,j=0;i<s.size() || j<str.size();i++,j++){
        if (i<s.size()) {
            arr[start++]=s.get(i);
        }
         if(j<str.size()){
            arr[start++]=str.get(i);
        }
      }
      System.out.println(Arrays.toString(arr));

    }
}
