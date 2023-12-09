package org.example.leetcode.graph.dfs;

import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {
        for(int [] i : floodFill(new int[][]{{1,1,1},{1,1,0},{1,0,1}},1,1,1)){
            System.out.println(Arrays.toString(i));
        }
    }
    static int [][]result ;
    static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        result = image;
        dfs(result,image[sr][sc],sr,sc,color);
        return result;
    }
    static void dfs(int[][] image ,int start ,int i ,int j,int color){
        if(i == image.length || j == image[0].length || i < 0 || j < 0 || image[i][j] != start){
            return;
        }
        image[i][j] = color;
        dfs(image,start,i+1,j,color);
        dfs(image,start,i,j+1,color);
        dfs(image,start,i-1,j,color);
        dfs(image,start,i,j-1,color);
    }
}
