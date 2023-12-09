package org.example.leetcode.twopointer;

import java.util.*;
import java.util.stream.Collectors;


public class KFrequentElement {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};int k = 2;

        for(int i : frequent(nums,k)){
            System.out.println(i);
        }
    }
    static int[] frequent(int[] nums , int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int [] ans  = new int[k];
        for(int i : nums){
            if(map.containsKey(i)){
                int value = map.get(i);
                map.put(i,value+1);
            }else{
                map.put(i,1);
            }
        }
        List<Map.Entry<Integer,Integer>> list =  map.entrySet().stream()
                .sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
                .collect(Collectors.toList());
        for(int i = 0 ; i < k ; i++){
            Map.Entry<Integer, Integer> entry = list.get(i);
            ans[i] = entry.getKey();
        }
        return ans;
    }
}
