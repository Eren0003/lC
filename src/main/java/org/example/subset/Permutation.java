package org.example.subset;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        System.out.println(per(nums));
    }
    static List<List<Integer>> per(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> num = new ArrayList<>();
        for(int i : nums){
            num.add(i);
        }
        helper(num,new ArrayList<>(),list);
        return list;
    }
    static void helper(List<Integer> nums,List<Integer>value,List<List<Integer>>ans){
        if(nums.size() == 1){
            value.add(nums.get(0));
            ans.add(value);
            return;
        }
    }
}
