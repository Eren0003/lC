package org.example.leetcode;

import java.util.HashMap;

public class new8 {
    public static void main(String[] args) {
        int n = 50;
        HashMap<Integer,Long> map = new HashMap<>();
        System.out.println(run(n,map));
        System.out.println(map);
    }
    static long run(int n,HashMap<Integer,Long> map){
        if(n <= 2) {
            return 1;
        }if(!map.isEmpty() && map.containsKey(n)){
            return map.get(n);
        }
       map.put(n, run(n - 1, map) + run(n - 2, map));
        return map.get(n);
    }
}
