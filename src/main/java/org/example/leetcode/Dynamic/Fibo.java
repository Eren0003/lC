package org.example.leetcode.Dynamic;

import java.util.ArrayList;
import java.util.HashMap;

public class Fibo {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        System.out.println(fiboseries(30,map));
        System.out.println(map);
    }
    static int fiboseries(int i, HashMap<Integer,Integer> map){
        if(map.containsKey(i)){
            return map.get(i);
        }
        if(i == 2 || i == 1){
            return 1;
        }else{
            map.put(i,fiboseries(i-1,map)+fiboseries(i-2,map));
            return map.get(i);
        }
    }
}
