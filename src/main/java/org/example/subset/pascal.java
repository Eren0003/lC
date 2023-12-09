package org.example.subset;

import java.util.ArrayList;
import java.util.List;

public class pascal {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        l.add(1);
        list.add(l);
        l1.add(1);
        l1.add(1);
        list.add(l1);
        List<Integer> lm = new ArrayList<>();
        lm.addAll(l1);
        pascalTriangle(numRows,list,lm);
        System.out.println(list);
    }
    static void pascalTriangle(int numRows,List<List<Integer>> listOfList,List<Integer>list){
        if(numRows < 0) {
            return;
        }
        List<Integer> m = new ArrayList<>();
        m.addAll(list);
        for(int i = list.size()-1 ; i > 0 ; i--){
            list.add(1,list.get(i-1)+list.get(i));
        }
        listOfList.add(list);
        pascalTriangle(numRows-1,listOfList,list);
    }
}
