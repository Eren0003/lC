package org.example.leetcode.graph.dfs;

import java.util.HashSet;
import java.util.Set;

public class CountSubIsland {
    public static void main(String[] args) {
        int[][] grid1 = {
                {1,0,0,1,1,1,1,1,1,1,1,0,0},          // {1,0,0,0,1,1,1,1,1,0,1,1,1}
                {0,1,1,1,1,1,1,0,1,1,1,1,1},          // {1,1,1,1,0,0,1,1,0,1,1,1,1}
                {1,0,1,1,1,1,0,1,1,1,1,0,1},          // {0,1,0,0,0,1,1,1,1,1,1,1,1}
                {1,1,0,0,1,1,0,0,1,1,1,1,1},          // {1,1,0,1,1,1,1,1,0,1,1,0,1}
                {0,1,0,1,1,1,0,1,1,1,0,1,1},          // {0,1,0,1,0,1,1,1,0,1,1,0,1}
                {0,1,1,1,0,1,0,1,1,0,1,1,0},          // {1,0,1,1,1,1,1,1,1,0,1,0,1}
                {1,0,1,1,1,0,1,1,1,1,1,1,0},          // {0,1,0,0,1,1,1,1,1,0,0,1,1}
                {1,1,0,0,0,1,1,1,0,0,1,1,1},          // {1,1,1,0,0,1,1,1,1,1,1,0,1}
                {0,0,1,0,1,1,1,1,1,1,0,0,1},          // {1,0,1,0,1,1,1,1,1,0,0,0,1}
                {1,1,1,1,0,0,1,1,1,1,1,1,1},          // {0,1,0,1,1,1,1,0,0,1,1,1,0}
                {1,1,1,1,1,1,1,0,0,1,1,1,1},          // {0,1,1,0,1,0,0,0,1,1,1,1,0}
                {1,0,0,1,0,1,1,0,0,0,1,0,0},          // {1,1,1,0,1,0,1,0,0,1,1,0,1}
                {1,1,1,1,0,1,1,1,1,1,1,1,1},          // {0,0,0,0,1,0,1,1,0,1,0,1,1}
                {1,0,1,1,1,1,1,1,1,1,1,1,1},          // {0,0,1,1,0,1,0,1,0,0,1,1,1}
                {0,0,1,1,0,1,1,0,1,1,1,1,1},          // {1,1,1,0,1,0,0,0,1,1,0,0,1}
                {1,1,1,1,0,1,1,1,1,1,0,1,1},          // {0,1,1,0,1,0,0,1,0,0,0,1,0}
                {1,0,1,1,1,1,0,0,0,0,0,1,0},          // {1,1,0,0,1,1,0,1,1,1,0,1,1}
                {1,1,0,1,0,0,1,1,1,0,0,0,1},          // {0,1,0,1,1,1,0,1,1,0,0,1,0}
                {1,1,1,1,1,1,1,1,1,1,1,1,1},          // {1,1,1,0,1,1,1,1,1,0,0,1,0}
                {1,1,1,1,1,1,1,1,1,1,1,0,1}};         // {0,1,1,1,1,1,0,1,0,1,0,0,1}
        int[][] grid2 = {
        {1,0,0,0,1,1,1,1,1,0,1,1,1},
        {1,1,1,1,0,0,1,1,0,1,1,1,1},
        {0,1,0,0,0,1,1,1,1,1,1,1,1},
        {1,1,0,1,1,1,1,1,0,1,1,0,1},
        {0,1,0,1,0,1,1,1,0,1,1,0,1},
        {1,0,1,1,1,1,1,1,1,0,1,0,1},
        {0,1,0,0,1,1,1,1,1,0,0,1,1},
        {1,1,1,0,0,1,1,1,1,1,1,0,1},
        {1,0,1,0,1,1,1,1,1,0,0,0,1},
        {0,1,0,1,1,1,1,0,0,1,1,1,0},
        {0,1,1,0,1,0,0,0,1,1,1,1,0},
        {1,1,1,0,1,0,1,0,0,1,1,0,1},
        {0,0,0,0,1,0,1,1,0,1,0,1,1},
        {0,0,1,1,0,1,0,1,0,0,1,1,1},
        {1,1,1,0,1,0,0,0,1,1,0,0,1},
        {0,1,1,0,1,0,0,1,0,0,0,1,0},
        {1,1,0,0,1,1,0,1,1,1,0,1,1},
        {0,1,0,1,1,1,0,1,1,0,0,1,0},
        {1,1,1,0,1,1,1,1,1,0,0,1,0},
        {0,1,1,1,1,1,0,1,0,1,0,0,1}};
        System.out.println(anotherIsland(grid1,grid2));
    }
    static int subIsland(int[][] grid1,int [][] grid2){
        int row = grid1.length;
        int col = grid1[0].length;
        int ans = 0;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++) {
                if (grid2[i][j] == 1) {
                    Set<String> set = new HashSet<>();
                    dfs(grid2, i, j, row, col, set);
                    for (String s : set) {
                        String [] array = s.split(",");
                        String first = array[0];
                        String second = array[1];
                        if (grid1[Integer.parseInt(first)][Integer.parseInt(second)] == 0) {
                            ans--;
                            break;
                        }
                    }
                    ans++;
                }
            }
        }
        return ans;
    }
    static int anotherIsland(int[][] grid1,int[][] grid2){
        int row = grid1.length;
        int col = grid1[0].length;
        int ans = 0 ;
        for(int i = 0 ;i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(grid2[i][j] == 1){
                    if(anotherDfs(grid1,grid2,i,j,row,col)){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    static boolean anotherDfs(int[][] grid1,int[][] grid2,int i , int j , int row ,int col){
        if(i < 0 || i == row || j == col || j < 0 || grid2[i][j]==0){
            return true;
        }
        if(grid1[i][j] == 0){
            return false;
        }
        grid2[i][j] = 0 ;
        boolean result = true;
        result = anotherDfs(grid1,grid2,i-1,j,row,col) && result ;
        result = anotherDfs(grid1,grid2,i+1,j,row,col) && result ;
        result = anotherDfs(grid1,grid2,i,j+1,row,col) && result ;
        result = anotherDfs(grid1,grid2,i,j-1,row,col) && result ;
        return result;
    }
    static void dfs(int[][] grid2 , int i , int j, int row ,int col , Set<String> set){
        if(i < row && i >= 0 && j < col && j >= 0 && !set.contains(i+","+j) && grid2[i][j] == 1){
            grid2[i][j] = 0;
            set.add(i+","+j);
            dfs(grid2 ,i-1,j,row,col,set);
            dfs(grid2 ,i+1,j,row,col,set);
            dfs(grid2,i,j-1,row,col,set);
            dfs(grid2,i,j+1,row,col,set);
        }
    }
}
