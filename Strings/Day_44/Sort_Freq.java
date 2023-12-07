package Strings.Day_44;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Sort_Freq {
    public static void main(String[] args) {
        String s="tree";
       // System.out.println(Freq(s));
        System.out.println(frequencySort(s));
    }
    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
	    for (char c: s.toCharArray()) {
		    map.put(c, map.getOrDefault(c, 0) + 1);
	    }
        
        //heap
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->(map.get(b)-map.get(a) ) ); //for decreasing order
        pq.addAll(map.keySet());
        
        //putting in string builder
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            char c = pq.poll();
            for(int i =0;i<map.get(c);i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    static String Freq(String s){
        int i=0;
        int a=0;
        String str="";
        char ch=' ';
        int count=1;
        System.out.println(s);
        while (i<s.length()) {
            if(s.charAt(i)==s.charAt(i+1)){
                ch=s.charAt(i);
                System.out.println(ch);
                count++;
            }
            else if(s.charAt(i)!=s.charAt(i+1)) {
                if(count>1){
                    a=count;
                    if(a>0){
                        str+=Character.toString(ch);
                        System.out.println(str);
                        a--;
                    }
                    else{
                        count--;
                        
                    }
                }else{
                     i++;
                } 
                
            }
           
        }
        while (i<s.length()) {
            if(s.charAt(i)!=ch){
                str+=s.charAt(i);
            }
        }
System.out.println(str);
        return str;
    }
    
}
