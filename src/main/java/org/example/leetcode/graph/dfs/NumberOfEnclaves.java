package org.example.leetcode.graph.dfs;

import java.util.*;

public class NumberOfEnclaves {
    public static void main(String[] args) {
        System.out.println(numEnclaves(new int[][]{
                {0,0,0,0},
                {0,1,1,0},
                {0,1,0,1},
                {0,0,0,0}}));
    }
    static int numEnclaves(int[][] grid) {
        boolean [][] isVisited = new boolean[grid.length][grid[0].length];
        int result = 0 ;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                List<int[]> list = new ArrayList<>();
                if(grid[i][j] == 1 && !isVisited[i][j]){
                    dfs(grid,list,i,j,isVisited);
                }
                boolean flag  = true;
                int[][] direction = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
                for(int[] arr : list){
                    for(int d = 0 ; d < direction.length ; d++){
                        int[] curr = new int[]{arr[0]+direction[d][0],arr[1]+direction[d][1]};
                        if(curr[0] == grid.length || curr[1] == grid[0].length || curr[0] < 0 || curr[1] < 0){
                            flag = false;
                            break;
                        }
                    }
                    if(!flag){
                        break;
                    }
                }
                if(flag){
                    result += list.size();
                }
            }
        }
        return result;
    }
    static void dfs(int[][] grid, List<int[]> list, int i , int j, boolean[][] isVisited){
        if(i == grid.length || j == grid[0].length || i < 0 || j < 0 || isVisited[i][j] || grid[i][j] == 0){
            return;
        }
        isVisited[i][j] = true;
        list.add(new int[]{i,j});
        dfs(grid,list,i+1,j,isVisited);
        dfs(grid,list,i-1,j,isVisited);
        dfs(grid,list,i,j+1,isVisited);
        dfs(grid,list,i,j-1,isVisited);
    }
}
