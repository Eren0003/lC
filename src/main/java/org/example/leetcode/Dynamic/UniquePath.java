package org.example.leetcode.Dynamic;

import java.util.HashMap;
import java.util.HashSet;

public class UniquePath {
    public static void main(String[] args) {
        int m = 18 ;int n = 18;
        HashMap<String,Integer> map = new HashMap<>();
        System.out.println(path(m,n,map));
        System.out.println(map);
    }
    static int path(int m , int n,HashMap<String,Integer> map){
        if(m == 1 || n == 1) return 1;
        if(m == 0 || n == 0) return 0;
        if(!map.isEmpty() && map.containsKey(m+","+n)){
            return map.get(m+","+n);
        }
        map.put(m+","+n,path(m-1,n,map) + path(m,n-1,map));
        return map.get(m+","+n);
    }
}
