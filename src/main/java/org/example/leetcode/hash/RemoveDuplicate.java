package org.example.leetcode.hash;

import java.util.HashMap;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
       duplicate(nums);
    }
    static void duplicate(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        int index = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                int value = map.get(nums[i]);
                if(value < 2){
                    map.put(nums[i],value+1);
                    nums[index] = nums[i];
                    index++;
                }
            }else{
                map.put(nums[i],1);
                nums[index] = nums[i];
                index++;
            }
        }
        for(int i = index ; i < nums.length ; i++){
            nums[i] = 0 ;
        }
    }
}
