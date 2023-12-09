package org.example.leetcode.SlidingWindow;

import java.util.HashMap;

public class LongestRepeatingCharacter {
    public static void main(String[] args) {
        String s = "AABBAAABBA";
        int k = 2;
        System.out.println(longestRep(s,k));
    }
    static int  longestRep(String s , int k){
        int start = 0 ;
        int end = 0 ;
        int result = 0 ;
        boolean flag = true;
        HashMap<Character,Integer> map = new HashMap<>();
        while(start <= end && end < s.length()){
            if(flag) {
                if (!map.isEmpty() && map.containsKey(s.charAt(end))) {
                    map.put(s.charAt(end), map.get(s.charAt(end)) + 1);
                } else {
                    map.put(s.charAt(end), 1);
                }
            }else{
                flag = true;
            }
            int max = 0 ;
            int windowMax = end - start +1;
            for(int i : map.values()){
                max = Math.max(max,i);
            }
            if(windowMax-max<=k){
                result = Math.max(result,s.substring(start,end+1).length());
                end++;
            }else{
                map.put(s.charAt(start),map.get(s.charAt(start))-1);
                flag = false;
                start++;
            }
        }
        return result;
    }
}
