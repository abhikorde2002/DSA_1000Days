package Complete_Heap.MAX_Heap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Replace {
    public static void main(String[] args) {
        int arr[]={20, 15, 26, 2, 98, 6};
        System.out.println(Arrays.toString(replaceWithRank(arr, arr.length)));
    }

    static int[] replaceWithRank(int arr[], int N) {
       int num[]=Arrays.copyOf(arr, N);
       Arrays.sort(num);
       Map<Integer,Integer> map= new HashMap<>();
       int ind=1;
       for (int i = 0; i < num.length; i++) {
            if(map.containsKey(num[i])) continue;
            else map.put(num[i], ind++);
       }
       for (int i = 0; i < arr.length; i++) {
        if(map.containsKey(arr[i])) num[i]=map.get(arr[i]);
       }
       return num;

    }
}
