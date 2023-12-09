package org.example.subset;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class array {
    public static void main(String[] args) {
        int [] nums = {3,4,5};
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            list.add(i);
        }
        List<List<Integer>> answer = new ArrayList<>();
        subSet(list ,new ArrayList<>(),answer);
        System.out.println(answer);
    }
    static void subSet(List<Integer> list,List<Integer>temp,List<List<Integer>> answer) {
        if(list.isEmpty()){
            if(!answer.contains(temp)) {
                answer.add(temp);
            }
            return;
        }
        int tem = list.get(0);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        left.addAll(temp);
        right.addAll(temp);
        left.add(tem);
        subSet(list.subList(1,list.size()),left,answer);
        subSet(list.subList(1,list.size()),right, answer);
    }
}
