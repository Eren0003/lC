package org.example.leetcode.twopointer;

import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {1000000000,1000000000,1000000000,1000000000};int target = -294967296;
        System.out.println(sum(nums,target));
    }
    static List<List<Integer>> sum(int[] nums,int target){
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length-2 ; i++){
            for(int j = i+1 ; j < nums.length-1 ; j++){
                if(nums[i] == 1000000000) return list;
                int intial = nums[i] + nums[j];
                int start = j+1;
                int end = nums.length-1;
                while(start<end){
                    List<Integer> l = new ArrayList<>();
                    int sum = intial + nums[start] + nums[end];
                    if(sum == target){
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[start]);
                        l.add(nums[end]);
                        if(!l.isEmpty() && !list.contains(l)) {
                            list.add(l);
                        }
                        start++;
                        end--;
                    }
                    else if(sum > target){
                        end--;
                    }
                    else {
                        start++;
                    }
                }
            }
        }
        return list;
    }
}
