package org.example.leetcode.graph.bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Matrix01 {
    public static void main(String[] args) {
        for(int [] i : updateMatrix(new int[][]{{1,1,1},{1,1,0},{1,0,0}})){
            System.out.println(Arrays.toString(i));
        }
    }
    static int[][] updateMatrix(int[][] mat) {
        Queue<int[]> queue = new LinkedList<>();
        boolean [][] isVisited = new boolean[mat.length][mat[0].length];
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
                if(mat[i][j] == 0){
                    queue.offer(new int[]{i,j});
                    isVisited[i][j] = true;
                }
            }
        }
        int[][] directions = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        while(!queue.isEmpty()){
            int[] poll = queue.poll();
            for(int [] i : directions){
                int [] curr = new int[]{poll[0]+i[0],poll[1]+i[1]};
                if(curr[0] != mat.length && curr[0] >= 0 && curr[1] != mat[0].length && curr[1] >= 0 && !isVisited[curr[0]][curr[1]]){
                    queue.offer(new int[]{poll[0]+i[0],poll[1]+i[1]});
                    if(mat[curr[0]][curr[1]] == 1 || mat[curr[0]][curr[1]] > mat[poll[0]][poll[1]]+1){
                        mat[curr[0]][curr[1]] = mat[poll[0]][poll[1]]+1 ;
                    }
                    isVisited[curr[0]][curr[1]] = true;
                }
            }
        }
        return mat;
    }
}
