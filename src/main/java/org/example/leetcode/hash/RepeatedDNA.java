package org.example.leetcode.hash;

import java.util.*;

public class RepeatedDNA {
    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(dna(s));
    }
    static List<String> dna(String s){
        HashMap<String,Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        int i = 0 ;
        while(i <= s.length()-10){
            String temp = s.substring(i,i+10);
            if(map.containsKey(temp)){
                int a = map.get(temp);
                map.put(temp,a+1);
                set.add(temp);
            }
            else {
                map.put(temp, 1);
            }
            i++;
        }
        return new ArrayList<>(set);
    }
}
