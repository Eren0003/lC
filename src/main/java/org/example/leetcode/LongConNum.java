package org.example.leetcode;

import java.sql.Array;
import java.util.*;

public class LongConNum {
    public static void main(String[] args) {
        int [] nums = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
        Arrays.sort(nums);
        for(int m : nums) {
            System.out.print(m+" ");
        }System.out.println();
        threeSum(nums);
    }
    static void threeSum(int [] nums){
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){

            int start = 0 ;
            int end = nums.length-1;
            while(start < end ) {
                if(start == i ) {
                    start++;
                    continue;
                }else if( end == i){
                    end--;
                    continue;
                }
                int total = nums[i] + nums[start] + nums[end];
                if (total == 0) {
                    int max1 = nums[i],max2 = nums[start],max3 = nums[end];
                    List<Integer> l = new ArrayList<>();
                    if(max1<=max2 && max1<=max3){
                        l.add(nums[i]);
                        l.add(nums[start]);
                        l.add(nums[end]);
                    }else if(max1 >= max2 && max1 <= max3){
                        l.add(nums[start]);
                        l.add(nums[i]);
                        l.add(nums[end]);
                    }else{
                        l.add(nums[start]);
                        l.add(nums[end]);
                        l.add(nums[i]);
                    }
                    if(!list.contains(l)) {
                        list.add(l);
                    }
                    start++;
                }
                if(total > 0){
                    end--;
                }
                else if(total < 0){
                    start++;
                }
            }
        }
        System.out.println(list);
    }
}
