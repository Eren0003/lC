package org.example.leetcode.hash;

import java.util.*;

public class AllAnagram {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(anagram(s,p));
    }
    static List<Integer> anagram(String s, String p){
        int i = 0 ;
        List<Integer> list = new ArrayList<>();
        int mainLen = s.length();
        int len = p.length();
        char[] ch = p.toCharArray();
        Arrays.sort(ch);
        while(i <= mainLen-len){
            char[] temp = s.substring(i,i+len).toCharArray();
            Arrays.sort(temp);
            if(Arrays.equals(temp,ch)){
                list.add(i);
            }
            i++;
        }
        return list;
    }

}
