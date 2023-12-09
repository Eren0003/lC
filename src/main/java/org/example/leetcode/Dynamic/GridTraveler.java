package org.example.leetcode.Dynamic;

import java.util.HashMap;

public class GridTraveler {
    public static void main(String[] args) {
        HashMap<String,Long> map = new HashMap<>();
        System.out.println(traveler(18,18,map));
        System.out.println(map);
    }
    static long traveler(long i,long j,HashMap<String,Long> map){
        if(map.containsKey(i+","+j)){
            return map.get(i+","+j);
        }
        if(i == 1 || j == 1){
            return 1;
        }
        else{
             map.put(i+","+j,traveler(i-1,j,map)+traveler(i,j-1,map));
             return map.get(i+","+j);
        }
    }
}
