package org.example.leetcode.SlidingWindow;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class ContainDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        int k = 1;
        System.out.println(duplicate(nums,k));
    }
    static boolean duplicate(int[]nums,int k){
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i = 0 ; i < nums.length ; i++){
           if(!map.containsKey(nums[i])){
               map.put(nums[i],i);
           }else if(map.containsKey(nums[i])){
               int index = map.get(nums[i]);
               if(Math.abs(index-i) <= k){
                   return true;
               }
               map.put(nums[i],i);
           }
       }
       return false;
    }

}
