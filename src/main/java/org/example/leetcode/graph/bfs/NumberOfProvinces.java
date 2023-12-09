package org.example.leetcode.graph.bfs;

import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.List;

public class NumberOfProvinces {
    public static void main(String[] args) {
        System.out.println(findCircleNum(new int[][]{{1,1,0},{1,1,0},{0,0,1}}));
    }
    static boolean [] isVisited ;
    static int findCircleNum(int[][] isConnected) {
        List<List<Integer>> list = new ArrayList<>();
        isVisited = new boolean[isConnected.length];
        for(int i = 0 ; i < isConnected.length ; i++ ){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0 ; j < isConnected.length ; j++){
                if(isConnected[i][j] == 1 && i != j){
                    temp.add(j);
                }
            }
            list.add(temp);
        }
        int result = 0 ;
        for(int i = 0 ; i < isConnected.length ; i++){
            if(!isVisited[i]){
                dfs(list,isVisited,i);
                result += 1;
            }
        }
        return result;
    }
    static void dfs(List<List<Integer>> list,boolean[] isVisited,int i){
        if(isVisited[i]){
            return;
        }
        isVisited[i] = true;
        for(int j : list.get(i)){
            dfs(list,isVisited,j);
        }
    }
}
