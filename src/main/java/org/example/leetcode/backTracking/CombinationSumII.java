package org.example.leetcode.backTracking;

import java.util.*;
import java.util.stream.Collectors;

public class CombinationSumII {
    public static void main(String[] args) {
     int [] candidates = {10,1,2,7,6,1,5};
     int target = 8;
        System.out.println(anotherCombination(candidates,target));
    }
    static List<List<Integer>> combination(int[] candidates, int target){
        Set<List<Integer>> list = new HashSet<>();
        Arrays.sort(candidates);
        helper(list,new Stack<>(),candidates,0,target,0);
        List<List<Integer>> l = new ArrayList<>(list);
        return l;
    }
    static void helper(Set<List<Integer>> list , Stack<Integer> temp , int[] candidates , int sum ,int target, int pointer){
        if(sum == target){
            List<Integer> l = temp.stream().toList();
            list.add(l);
            return;
        }
        if(sum > target || pointer >= candidates.length){
            return;
        }
        temp.add(candidates[pointer]);
        helper(list,temp,candidates,sum+candidates[pointer],target,pointer+1);
        temp.pop();
        helper(list,temp,candidates,sum,target,pointer+1);
    }
    static List<List<Integer>> anotherCombination(int[] candidates,int target){
        Set<List<Integer>> list = new HashSet<>();
        dfs(candidates,target,list,0,new Stack<>(),0);
        return list.stream().toList();
    }
    static void dfs(int[] candidates , int target ,Set<List<Integer>> result ,int sum,Stack<Integer> list,int index){
        if(target == sum){
            List<Integer> m = list.stream().sorted().toList();
            result.add(m);
            return;
        }if(target < sum || index >= candidates.length) return;
        list.add(candidates[index]);
        dfs(candidates,target,result,sum+candidates[index],list,index+1);
        list.pop();
        dfs(candidates,target,result,sum,list,index+1);
    }

}
