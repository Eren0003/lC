package org.example.leetcode.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MaxVowel {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(vowel1(s,k));
    }
    static int vowel(String s ,int k){
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            switch(c) {
                case 'a', 'i', 'e','o','u':
                    map.put(i,true);
                    break;
                default:
                    map.put(i,false);
                    break;
            }
        }
        int end = k ;
        int count = 0 ;
        for(int i = 0 ; i < k ; i++){
            if(map.get(i)){
                count += 1;
            }
        }
        int max = count;
        while(end < map.size()){
            if(map.get(end)){
                count += 1;
            }
            if(map.get(end-k)){
                count -= 1;
            }
            end++;
            max = Math.max(count,max);
        }
        System.out.println(map);
        return max;
    }
    static int vowel1(String s , int k){
        List<Character> list = Arrays.asList('a','e','i','o','u');
        int counter = 0;
        for(int i = 0 ; i < k ; i++){
            if(list.contains(s.charAt(i))){
                counter++;
            }
        }
        int max = counter;
        int end = k;
        while(end < s.length()){
            if(list.contains(s.charAt(end))){
                counter++;
            }if(list.contains(s.charAt(end-k))){
                counter--;
            }
            end++;
            max = Math.max(counter,max);
        }
        return max;
    }
}
