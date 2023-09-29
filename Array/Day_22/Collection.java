package Array.Day_22;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Collection {
    public static void main(String[] args) {
          LinkedHashMap<Integer,Integer> hm= new LinkedHashMap<>();
          hm.put(3, 22);
          hm.put(2, 21);
          hm.put(1, 11);
           int a=0;
          a= hm.get(3);
          int b= a.toInteger();
        }

}
