package org.example.leetcode.hash;

import java.util.HashMap;

public class SubArraySum {

    public static void main(String[] args) {
        int[] nums = {-1,-1,1};
        int k = 0;
        System.out.println(subarraySum(nums,k));
    }
    static int subarraySum(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0 ;
        int result = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            int diff = sum - k ;
            if(map.containsKey(diff)){
                result += map.get(diff);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }else{
                map.put(sum,1);
            }
        }
        return result;
    }
}
