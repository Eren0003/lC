package org.example.leetcode.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        String s = "abdcdabcebb";
//        System.out.println(s.substring(0,0));
        System.out.println(longSub(s));
    }
    static int longSub(String s){
        int start = 0 ;
        int end = start;
        int len = 0;
        int max = 0 ;
        Set<Character> set = new HashSet<>();
        while(end < s.length()){
            if(set.isEmpty()){
                set.add(s.charAt(end));
                len++;
                end++;
            }else if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                len++;
                end++;
            }else{
                set.remove(s.charAt(start));
                start++;
                len--;
            }
            max = Math.max(len,max);
        }
        return max;
    }
}
