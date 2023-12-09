package org.example.leetcode.twopointer;

import java.util.HashMap;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {1000000000,} ;
        System.out.println(large(nums));
    }
    static String large(int[] nums){
        int i = 0 ;
        int j = i+1;
        String result = "";
        while(i < nums.length){
            while(j < nums.length) {
                String iTh = String.valueOf(nums[i]);
                String jTh = String.valueOf(nums[j]);
                long iTemp = Long.parseLong(iTh + jTh);
                long jTemp = Long.parseLong(jTh + iTh);
                if(iTemp < jTemp){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++;
            }
            i++;
            j = i+1;
        }
        int sum = 0;
        for(int m : nums){
            result += m;
            sum += m;
        }
        if(sum == 0) return "0";
        return result;
    }
}
