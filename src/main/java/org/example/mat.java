package org.example;

import java.util.ArrayList;
import java.util.List;

public class mat {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,4,5,6,4};
        int target = 4;
        int index = 0 ;
        System.out.println(repeatedNum(nums,target,index));
    }
    static List<Integer> repeatedNum (int[] nums , int target , int index ){
        List<Integer> ans = new ArrayList<>();
        if(index >= nums.length) {
            return ans;
        }
        if(nums[index] == target){
            ans.add(index);
        }
        index = index + 1;
        List<Integer> array = repeatedNum(nums,target,index);
        ans.addAll(array);
        return ans;
    }
}
