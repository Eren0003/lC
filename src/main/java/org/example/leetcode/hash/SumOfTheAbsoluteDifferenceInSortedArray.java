package org.example.leetcode.hash;

import java.util.Arrays;

public class SumOfTheAbsoluteDifferenceInSortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSumAbsoluteDifferences(new int[]{1,4,6,8,10})));
    }
    static int[] getSumAbsoluteDifferences(int[] nums) {
        int [] result = new int[nums.length];
        int[] rev = new int[nums.length];
        int[] start = new int[nums.length];
        int j = nums.length-1;
        int first = 0 ;
        int last = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            first += nums[i];
            last += nums[j];
            rev[j] = last;
            start[i] = first;
            j--;
        }
        for(int i = 0 ; i < nums.length ; i++){
            int temp1 = rev[i]-(nums[i]*((nums.length-i)));
            int temp2 = 0 ;
            if(i != 0){
                temp2 = Math.abs(start[i-1]-(nums[i]*(i)));
            }
            result[i] = temp1+temp2;
        }
        String s = "dklfajd";
        return result;
    }
}
