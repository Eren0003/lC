package org.example.leetcode.Dynamic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StepsToEnd {
    public static void main(String[] args) {
        System.out.println(step(5));
    }
    static int step(int n){
        int result = 0;
        List<Integer> list = new ArrayList<>();
        return fibo(5,0,new HashMap<>());
    }
    static int fibo(int n ,int index ,HashMap<Integer,Integer> map){
        if(map.containsKey(index)){
            return map.get(index);
        }
        if(index == n || index == n-1 ){
            map.put(index,1);
            return 1;
        }else{
            map.put(index,fibo(n, index + 1,map) + fibo(n, index + 2,map));
            return map.get(index);
        }
    }
}
