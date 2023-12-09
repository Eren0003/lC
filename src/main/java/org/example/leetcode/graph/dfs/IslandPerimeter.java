package org.example.leetcode.graph.dfs;

import java.util.HashSet;
import java.util.Set;

public class IslandPerimeter {
    public static void main(String[] args) {
        System.out.println(anotherMethod(new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}}));
    }

//    0,1,0,0
//    1,1,1,0
//    0,1,0,0
//    1,1,0,0

    static int island (int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    Set<String> set = new HashSet<>();
                    return dfs(grid, i, j, row, col, set);
                }
            }
        }
        return -1;
    }
    static int dfs ( int[][] grid, int i, int j ,int row,int col , Set<String> set){
        if(i >= row || i < 0 || j >= col || j < 0 || grid[i][j] == 0){
            return 1;
        }if(set.contains(i+","+j)){
            return 0;
        }
        set.add(i+","+j);
        int result = dfs(grid,i,j+1,row,col,set);
        result += dfs(grid,i+1,j,row,col,set);
        result += dfs(grid,i-1,j,row,col,set);
        result += dfs(grid,i,j-1,row,col,set);
        return result;
    }
    static int anotherMethod(int[][] grid){
        int ans = 0 ;
        int row = grid.length;
        int col = grid[0].length ;
        for(int i = 0 ; i < row ; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    if (i + 1 >= row || grid[i + 1][j] == 0) {
                        ans += 1;
                    } if (j - 1 < 0 || grid[i][j - 1] == 0) {
                        ans += 1;
                    }if (i - 1 < 0 || grid[i - 1][j] == 0) {
                        ans += 1;
                    }if (j + 1 >= col || grid[i][j + 1] == 0) {
                        ans += 1;
                    }
                }
            }
        }
        return ans;
    }


}
