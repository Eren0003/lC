package org.example.leetcode.Dynamic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinCost {
    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        cost(new int[]{2,7,9,3,1},0 ,0,result);
        int temp = result.get(0);
        for(int i : result){
            if(temp > i){
                temp = i;
            }
        }
//        System.out.println(cost1(new int[]{1,100,1,1,1,100,1,1,100,1}));
//        System.out.println(temp);
    }
//    static int cost1(int [] nums){
//
//        for(int i = 2 ; i < nums.length ; i++){
//            nums[i] += Math.min(nums[i-2],nums[i-1]);
//        }
//        for(int i : nums){
//            System.out.print(i+" ");
//        }
//        return Math.min(nums[nums.length-2],nums[nums.length-1]);
//    }
    static void cost(int[] cost ,int index,int temp,List<Integer> result){
        if(index+1 >= cost.length) {
            result.add(temp);
            return;
        }
        cost(cost,index+1,temp+cost[index],result);
        if(index+2 >= cost.length) {
            result.add(temp);
            return;
        }
        cost(cost,index+3,temp+cost[index+2],result);
    }
}
