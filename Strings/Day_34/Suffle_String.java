package Strings.Day_34;

import java.util.Arrays;

public class Suffle_String {
    public static void main(String[] args) {
      String  s = "codeleet";
      int []indices = {4,5,6,7,0,2,1,3};
     Sorts(s, indices);
      System.out.println(Replace(s, indices));
      System.out.println(Replaces(s, indices));
    }

    static void Sorts(String str,int arr[]){
        int i=0;
        char ch[] = str.toCharArray();
        while(i<arr.length){
           int index=arr[i];
           if(arr[i]!=arr[index]){
                int tem=arr[i];
               arr[i]=arr[index];
               arr[index]=tem;
               int h=str.charAt(i);
               int b=str.charAt(index);
               
               char temp = ch[i];
               ch[i] = ch[index];
               ch[index] = temp;
           }
           else{
            i++;
           }     
        }
        // str=ch.toString();
        System.out.println(Arrays.toString(ch));
        
       }

       static String Replace(String s,int[] indices){
        int length=s.length();
        StringBuilder sb=new StringBuilder("");
         char c[]=new char[length];
        for(int i=0;i<length;i++){

            c[indices[i]]=s.charAt(i);
        }
        sb.append(c);
        return sb.toString();
       }
        static String Replaces(String s,int[] indices){
         int length=s.length();
        // // StringBuilder sb=new StringBuilder("");
        // String str="";
         char c[]=new char[length];
        for(int i=0;i<length;i++){

            c[indices[i]]=s.charAt(i);
     
        }
        return new String(c);
        // sb.append(c);
        // return sb.toString();
       }
}
