package org.example.leetcode.twopointer;

import java.util.*;


public class GroupAnagram {
    public static void main(String[] args) {
        String []s = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(group(s));
    }

    static List<List<String>> group(String[] strs){

        HashMap<String,List<String>> map = new HashMap<>();
       for(int i = 0 ; i < strs.length ; i++){
           List<String> list = new ArrayList<>();
           char [] a = strs[i].toCharArray();
           Arrays.sort(a);
           String temp = String.valueOf(a);
           System.out.println(temp);
           if(map.containsKey(temp)){
               List<String> s = map.get(temp);
               list.add(strs[i]);
               list.addAll(s);
               map.put(temp,list);
           }else{
               list.add(strs[i]);
               map.put(temp,list);
           }
       }
        Collection<List<String>> values = map.values();
        List<List<String>> ans = new ArrayList<>(values);
        return ans;
    }
}