package org.example.leetcode.Dynamic;

public class MinPathSum {
    public static void main(String[] args) {
        int [][] grid = {{1,2,3},{4,5,6}};
        System.out.println(sum(grid));
        for(int[] a : grid){
            for(int b : a ){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
    static int sum(int[][] grid){
        int n = grid.length-1;
        int m = grid[0].length-1;
        for(int i = n ; i >= 0 ; i--){
            for(int j = m ; j >= 0 ; j--){
                if(j == m && i == n){
                }else if(i == n){
                    grid[i][j] += grid[i][j + 1];
                }else if(j == m){
                    grid[i][j] += grid[i+1][j];
                }else{
                    grid[i][j] += Math.min(grid[i+1][j],grid[i][j+1]);
                }
            }
        }
        return grid[0][0];
    }
}
