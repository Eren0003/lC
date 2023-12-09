package org.example.leetcode.backTracking;

import java.util.*;

public class Permutation {
    public static void main(String[] args) {

    }
    static List<List<Integer>>per(int[] nums){
        Set<List<Integer>> list = new HashSet<>();
        helper(nums,list , new ArrayList<>(),0);
        System.out.println(list);
        return list.stream().toList();
    }
    static void helper(int[] nums,Set<List<Integer>> list , List<Integer> temp, int pointer){
        if(temp.size() == nums.length){
            List<Integer> l = temp;
            list.add(l);
        }

    }

}
