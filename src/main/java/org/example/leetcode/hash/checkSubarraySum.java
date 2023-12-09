package org.example.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

public class checkSubarraySum {
    public static void main(String[] args) {
        int [] nums = {1,2,12};
        int k = 6;
        System.out.println(subArray(nums,k));
    }
    static boolean subArray(int[] nums,int k){
        Map<Integer,Integer>map= new HashMap<>();
        int sum = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            if(sum%k == 0){
                return true;
            }
            if(map.containsKey(sum%k) && sum >= k ){
                if(i-map.get(sum%k)>1) {
                    return true;
                }
            }
            map.put(sum%k,i);
        }
        return false;
    }
}
