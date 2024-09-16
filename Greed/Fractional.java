package Greed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;


public class Fractional {
    public static void main(String[] args) {
        Item arr[] = {new Item (100,20),new Item(60,10),new Item(120,30)};
       
      System.out.println(  Knapsak(arr,50,arr.length));
    }
  
    static double Knapsak(Item[] arr,int w,int n){
        Arrays.sort(arr, new itemComparator());

        int curr=0;
        double finalvalue=0.0;
        
        for (int i = 0; i < n; i++) {
            if(curr+arr[i].weight<=w){
                curr+=arr[i].weight;
                finalvalue+=arr[i].value;
            }
            else{
                int remain=w-curr;
                finalvalue+= ((double)arr[i].value/ (double)arr[i].weight) * (double)remain;
                break;
            }
        }
        return finalvalue;
    }

}
class Item {
    int value, weight;
    Item(int x, int y) {
      this.value = x;
      this.weight = y;
    }
  }
  
  class itemComparator implements Comparator<Item>
  {
      @Override
      public int compare(Item a, Item b) 
      {
          double r1 = (double)(a.value) / (double)(a.weight); 
          double r2 = (double)(b.value) / (double)(b.weight); 
          if(r1 < r2) return 1; 
          else if(r1 > r2) return -1; 
          else return 0; 
      }
  }
