package Stack_Queue.Que;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class LRU {
   
    public static void main(String[] args) {
    
    }
     int cap;
    Queue<Integer> que= new ArrayDeque<>();
    Map<Integer, Integer> map= new HashMap<>();
    public LRU(int capacity) {
        this.cap=capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            que.remove(key);
            que.offer(key);
            return map.get(key);
        }
        else{
            return -1;
        }
    }
    
    public void put(int key, int val) {
        if(map.containsKey(key)){
            que.remove(key);
            que.offer(key);
            map.put(key,val);
        }
        else{
            if(que.size()<cap){
                que.offer(key);
            }
            else{
                map.remove(que.poll());
                que.offer(key);
            }
            map.put(key,val);
        }
    }
}
