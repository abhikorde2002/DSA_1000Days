package Complete_Heap.MAX_Heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class Task_Shedular {
    public static void main(String[] args) {
        char ch[]={'A','A','A','B','B','B'};
        System.out.println(leastInterval(ch, 2));
    }

    static int leastInterval(char[] arr, int n) {
        Map<Character,Integer> map= new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);

        }
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b) -> b-a);

        pq.addAll(map.values());
        int time=0;
        while (pq.size()>0) {
            List<Integer> list= new ArrayList<>();

            for (int i = 0; i <=n; i++) {
                if(pq.size()>0){
                    int cou=pq.poll();
                    cou--;
                    if(cou>0){
                        list.add(cou);
                    }
                }
                time+=1;
                if (pq.size()==0 && list.size()==0) {
                    break;
                }
            }
            pq.addAll(list);
        }
        return time;
    }
}
