package org.example.leetcode.twopointer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubarrayWithAtmostKFrequency {
    public static void main(String[] args) {
        System.out.println(maxSubarrayLength(new int[]{1,2,3,3,5},1));
    }
    public static int maxSubarrayLength(int[] nums, int k) {
        int start = 0 ;
        int end = 0 ;
        int result = 0 ;
        HashMap<Integer,Integer> map = new HashMap<>();
        int prev = -1 ;
        boolean flag = false ;
        while(start <= end && end < nums.length){
            if(flag){
                map.put(nums[start],map.get(nums[start])-1);
                if(map.get(nums[start]) <= 0){
                    map.remove(nums[start]);
                }
                if(prev == nums[start]){
                    flag = false;
                }
                start += 1;
            }else{
                result = Math.max(result,end-start);
                map.putIfAbsent(nums[end],0);
                map.put(nums[end],map.get(nums[end])+1);
                if(map.get(nums[end]) > k ){
                    prev = nums[end];
                    flag = true ;
                }
                end++;
            }
        }
        if(map.containsKey(prev) && map.get(prev) > k){
            return result;
        }
        return Math.max(result,end-start);
    }
}
