package org.example.leetcode.twopointer;

public class MaxWidthRamp {
    public static void main(String[] args) {
      int[] nums = {9,8,1,0,1,9,4,0,4,1};
      System.out.println(ramp(nums));
    }
    static int ramp(int[] nums){
        int i = 0 ;
        int j = nums.length-1;
        while(i < j){
            if(nums[i] <= nums[j]){
                return j-i;
            }else if(nums[i] > nums[j]){
                    i++;
            }else{
                j--;
            }
        }
        return 0;
    }
}
