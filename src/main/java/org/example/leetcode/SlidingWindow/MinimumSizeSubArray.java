package org.example.leetcode.SlidingWindow;

public class MinimumSizeSubArray {

    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        System.out.println(subArray(nums,target));
    }
    static int subArray(int [] nums, int target){
        int start = 0;
        int end = 0 ;
        int total = 0 ;
        int result = Integer.MAX_VALUE;
        while(start <= end){
            if(total >= target){
                total -= nums[start];
                result = Math.min(result,end-start);
                start++;
            }else{
                if(end == nums.length){
                    break;
                }
                total += nums[end];
                end++;
            }
        }
        if(result == Integer.MAX_VALUE){
            return 0;
        }
        return result;
    }
}
