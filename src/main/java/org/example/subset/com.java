package org.example.subset;

import java.util.ArrayList;
import java.util.List;

public class com {
    public static void main(String[] args) {
        int n = 1 ; int k = 1 ;
        List<List<Integer>> listOfList = new ArrayList<>();
        combination(n,k,1,listOfList,new ArrayList<>());
        System.out.println(listOfList);
    }

    static void combination(int n, int k,int num,List<List<Integer>> listOfList,List<Integer> list) {
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(list);
        if(list1.size() >= k){
            listOfList.add(list1);
            return ;
        }
        if(num > n){
            return;
        }
        combination(n,k,num+1,listOfList,list1);
        list1.add(num);
        combination(n,k,num+1,listOfList,list1);
    }
}

