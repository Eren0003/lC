package org.example.leetcode.Dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class BrickWall {
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(100000000,100000000),
                Arrays.asList(100000000,100000000)

//               Arrays.asList(1,2,2,1),
//                Arrays.asList(3,1,2),
//                Arrays.asList(1,3,2),
//                Arrays.asList(2,4),
//                Arrays.asList(3,1,2),
//                Arrays.asList(1,3,1,1)
        );
//        System.out.println(brickWall(list));
        System.out.println();
        System.out.println(13*3);
    }
    public static int wall(List<List<Integer>> wall){
        HashMap<Integer,Integer> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean one = true;
        for(int i = 0 ; i < wall.size() ; i++){
            List<Integer> temp = wall.get(i);
            List<Integer> l = new ArrayList<>();
            for(int j = 0 ; j < temp.size() ; j++){
                int t ;
                if(j == 0) {
                    t = temp.get(j);
                    l.add(t);
                }
                else if(j == temp.size()-1) {
                    one = false;
                    continue;
                }
                else{
                    t =
                    t = l.get(j-1)+temp.get(j);
                    l.add(t);
                    one = false;
                }
                if(map.containsKey(t)){
                    int count = map.get(t);
                    map.put(t,count+1);
                }else{
                    map.put(t,1);
                }
            }
            ans.add(l);
        }int max = 0 ;
        for(int i : map.values()){
            if(max < i){
                max = i;
            }
        }
        if(one) return wall.size();
        return wall.size()-max;
    }
    static int brickWall(List<List<Integer>> wall){

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < wall.size() ; i++){
            List<Integer> temp = wall.get(i);
            int sum = 0;
            for(int j = 0 ; j < temp.size() ; j++){
                if(j == 0){
                    sum = temp.get(j);
                }
                else if(j == temp.size()-1) continue;
                else {
                    sum += temp.get(j);
                }
                if(map.containsKey(sum)){
                    int count = map.get(sum);
                    map.put(sum,count+1);
                }
                else{
                    map.put(sum,1);
                }
            }
        }
        int max = 0;
        for(int i : map.values()){
            if(max < i){
                max = i;
            }
        }
        if(map.containsKey(100000000)) return wall.size()-max;
        if(map.size() == 1) return max;
        return wall.size()-max;
    }
}