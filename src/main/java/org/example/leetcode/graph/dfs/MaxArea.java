package org.example.leetcode.graph.dfs;

import java.util.HashSet;
import java.util.Set;

public class MaxArea {
    public static void main(String[] args) {
        System.out.println(area(new  int[][]{
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}}));
    }
    static int area(int[][] grid){
        int row = grid.length;
        int col = grid[0].length;
        Set<String> set = new HashSet<>();
        int max = 0 ;
        int ans = 0;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(grid[i][j] == 1 && !set.contains(i+","+j)){
                    set.add(i+","+j);
                    ans++;
                    ans = dfs(grid,i,j,row,col,set,ans);
                    max = Math.max(ans,max);
                    ans = 0;
                }
            }
        }
        return max;
    }
    static int dfs(int[][]grid,int i , int j , int row,int col,Set<String> set,int ans){
        if(i+1 < row && grid[i+1][j] == 1 && !set.contains((i+1)+","+j)){
            set.add((i+1)+","+j);
            ans++;
            ans = dfs(grid,i+1,j,row,col,set,ans);
        }if(i-1 >= 0 && grid[i-1][j] == 1 && !set.contains((i-1)+","+j)){
            set.add((i-1)+","+j);
            ans++;
            ans = dfs(grid,i-1,j,row,col,set,ans);
        }if(j+1 < col && grid[i][j+1] == 1 && !set.contains(i+","+(j+1))){
            set.add(i+","+(j+1));
            ans++;
            ans =  dfs(grid,i,j+1,row,col,set,ans);
        }if(j-1 >= 0 && grid[i][j-1] == 1 && !set.contains(i+","+(j-1))){
            set.add((i+","+(j-1)));
            ans++;
            ans = dfs(grid,i,j-1,row,col,set,ans);
        }
        return ans;
    }
}
