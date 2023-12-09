package org.example.leetcode.graph.dfs;

import java.util.ArrayList;
import java.util.List;

public class AllPathFromSourceToDestination {
    public static void main(String[] args) {
        System.out.println(allPathsSourceTarget(new int[][]{{4,3,1},{3,2,4},{3},{4},{}}));
    }
    static List<List<Integer>> list ;
     static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        list = new ArrayList<>() ;
        List<Integer> l = new ArrayList<>();
        l.add(0);
        dfs(graph,0,list,l);
        return list;
    }
    static void dfs(int[][] graph,int i ,List<List<Integer>> result ,List<Integer> list){
        if(i == graph.length-1){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int j = 0 ; j < graph[i].length ; j++){
            list.add(graph[i][j]);
            dfs(graph,graph[i][j],result,list);
            list.remove(list.size()-1);
        }
    }

}
