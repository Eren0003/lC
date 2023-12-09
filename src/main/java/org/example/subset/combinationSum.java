package org.example.subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,6,7);
        int target = 7 ;
        List<List<Integer>> listOfList = new ArrayList<>();
        combination(list,new ArrayList<>(),listOfList,list.size());
        System.out.println(listOfList);
    }
    static void combination(List<Integer> list,List<Integer>temp,List<List<Integer>> answer,int size) {
        if (list.isEmpty() ) {
                answer.add(temp);
            return;
        }
        int tem = list.get(0);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        left.addAll(temp);
        right.addAll(temp);
        left.add(tem);
        combination(list.subList(1,list.size()),left,answer,size);
        combination(list.subList(1,list.size()),right, answer,size);
    }

}
