package org.example.leetcode.graph.dfs;

import java.util.HashSet;
import java.util.Set;

public class NumberOfIsland {
    public static void main(String[] args) {
        System.out.println(anotherIsland((new char[][] {{'1','1','1'},
                                                {'0','1','0'},
                                                {'1','1','1'}})));
    }
    static int island(char [][] grid){
        int row = grid.length;
        int col = grid[0].length;
        Set<String> set = new HashSet<>();
        int ans = 0 ;
        for (int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(!(set.contains(i+","+j)) && grid[i][j] == '1'){
                    set.add(i+","+j);
                    dfs(grid,i,j,row,col,set);
                    ans++;
                }
            }
        }
        return ans;
    }
    static void dfs(char[][] grid,int i , int j , int row ,int col, Set<String> set){
        if(i+1 < row && grid[i+1][j] == '1' && !set.contains((i+1)+","+j)){
            set.add((i+1)+","+j);
            dfs(grid,i+1,j,row,col,set);
        }if(i-1 >= 0 && grid[i-1][j] == '1' && !set.contains((i-1)+","+j)){
            set.add((i-1)+","+j);
            dfs(grid,i-1,j,row,col,set);
        }if(j+1 < col && grid[i][j+1] == '1' && !set.contains(i+","+(j+1))){
            set.add(i+","+(j+1));
            dfs(grid,i,j+1,row,col,set);
        }if(j-1 >= 0 && grid[i][j-1] == '1' && !set.contains(i+","+(j-1))){
            set.add((i+","+(j-1)));
            dfs(grid,i,j-1,row,col,set);
        }
    }
    static int anotherIsland(char[][] grid){
        int row = grid.length;
        int col = grid[0].length;
        int ans = 0 ;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0  ; j < col ; j++){
                if(grid[i][j] == '1'){
                    ans++;
                    anotherDfs(grid,i,j,row,col);
                }
            }
        }
        return ans;
    }
    static void anotherDfs(char[][] grid, int i , int j , int row, int col){
        if(i < 0 || i >= row || j < 0 || j >= col || grid[i][j] =='0'){
            return;
        }
        grid[i][j] = '0';
        anotherDfs(grid,i+1,j,row,col);
        anotherDfs(grid,i-1,j,row,col);
        anotherDfs(grid,i,j-1,row,col);
        anotherDfs(grid,i,j+1,row,col);
    }

}
