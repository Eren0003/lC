package org.example.leetcode.twopointer;

import java.util.Arrays;

public class NumberSequence {
    public static void main(String[] args) {
        int[] nums = {3,5,6,7};
        int target = 9;
        System.out.println(sequence(nums,target));
    }
    static int sequence(int[] nums, int target){
        Arrays.sort(nums);
        int ans = 0 ;
        int i = 0 ;
        while(i < nums.length){
            int j = i ;
            while(j < nums.length){
                if(nums[i]+ nums[j] <= target){
                    j++;
                }else if(nums[i]+nums[j] > target){
                    ans += Math.pow(2,j-i-1);
                    break;
                }
                if(j == nums.length){
                    ans += Math.pow(2,j-i-1);
                }
            }i++;
        }
        return ans;
    }
}
