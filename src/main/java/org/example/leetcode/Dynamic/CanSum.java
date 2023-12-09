package org.example.leetcode.Dynamic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CanSum {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Boolean> map = new HashMap<>();
        boolean ans = sum(new int[]{3,4,7},7,map,list);
        System.out.println(ans);
        System.out.println(map);
        System.out.println(list);
    }
    static boolean sum(int[] nums,int target,HashMap<Integer, Boolean> map,List<Integer> list){
        if(target == 0){
            return true;
        }
        if(target < 0){
            return false;
        }
        List<Integer> l = new ArrayList<>();
        for(int i : nums){
            int rem = target - i ;
            if(map.containsKey(i)){
                return true;
            }
            if(sum(nums,rem,map,list)){
                map.put(target,true);
                list.add(i);
                return true;
            }
        }
        map.put(target,false);
        return false;
    }

}
