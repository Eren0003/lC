package org.example.leetcode.Dynamic;

import java.util.ArrayList;
import java.util.List;

public class combinationSumThree {
    public static void main(String[] args) {
        int index = 1, n = 25,k = 6;
        List<List<Integer>> list = new ArrayList<>();
        method(index,k,n,new ArrayList<>(),list);
        System.out.println(list);
    }
    static void method(int index ,int k, int n,List<Integer> list,List<List<Integer>> listOfList){
        if(n == 45){
         List<Integer> l = new ArrayList<>();
         for(int i = 1 ; i < 10 ; i++){
             l.add(i);
         }
         listOfList.add(l);
        }
        else {
            if(list.size() > k){
                return;
            }
            if (index == n+1) {
                int sum = 0;
                for (int i : list) {
                    if(i > 9){
                        return;
                    }
                    sum = sum + i;
                }
                if (sum == n && list.size() == k) {
                    listOfList.add(list);
                    return;
                }
                return;
            }
                List<Integer> left = new ArrayList<>();
                left.add(index);
                List<Integer> right = new ArrayList<>();
                left.addAll(list);
                right.addAll(list);
                method(index + 1, k, n, left, listOfList);
                method(index + 1, k, n, right, listOfList);
        }
    }
}
