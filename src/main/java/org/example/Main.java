package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int lo = 12, hi = 15, k = 2;
        System.out.println(fun(lo,hi,k));
    }
    static int fun (int lo , int hi , int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = lo ; i <= hi ; i++){
            System.out.println(i);
            map.put(i, power(i));
        }
        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(map.entrySet());
        Collections.sort(sortedEntries, Map.Entry.<Integer, Integer>comparingByValue().reversed());
        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
        List<Integer> temp = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : sortedEntries) {
            sortedMap.put(entry.getKey(), entry.getValue());
            temp.add(0,entry.getKey());
        }
        System.out.println(sortedMap);
        System.out.println(temp);
        return temp.get(k-1);
    }
    static int power(int num){
        int counter = 0 ;
        while( num != 1){
            if(num%2 == 0){
                num = num/2;
                counter++;
            }
            else{
                num = (num*3)+1;
                counter++;
            }
        }
        return counter;
    }

}




