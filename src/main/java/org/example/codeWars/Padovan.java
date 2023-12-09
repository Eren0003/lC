package org.example.codeWars;

import java.util.HashMap;

public class Padovan {
    public static void main(String[] args) {
        System.out.println(pad(12,new HashMap<>()));
    }
    static long pad(int n,HashMap<Integer,Long> map){
        if(n < 3){
            return 1;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }else{
           long temp =  pad(n-3,map)+pad(n-2,map);
           map.put(n,temp);
           return map.get(n);
        }
    }
}
