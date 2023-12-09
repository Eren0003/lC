package org.example.leetcode.graph.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOrange {
    public static void main(String[] args) {
        System.out.println(orange(new int[][]{{1},{2}}));
    }
    static int orange(int[][] grid){
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;
        int time = 0;
        int row = grid.length;
        int col = grid[0].length;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(grid[i][j] == 1){
                    fresh++;
                }else if(grid[i][j] == 2){
                    queue.add(new int[]{i,j});
                }
            }
        }
        if(queue.isEmpty()) return -1;
        if(queue.isEmpty() && fresh == 0) return -1;
        while(!queue.isEmpty()){
            int size = queue.size();
            boolean flag = false;
            while(size != 0) {
                int r = queue.peek()[0];
                int c = queue.peek()[1];
                if (r - 1 >= 0 && grid[r - 1][c] == 1) {
                    queue.add(new int[]{r - 1, c});
                    grid[r - 1][c] = 2;
                    fresh--;
                    flag = true;
                }
                if (r + 1 < row && grid[r + 1][c] == 1) {
                    queue.add(new int[]{r + 1, c});
                    grid[r + 1][c] = 2;
                    fresh--;
                    flag = true;
                }
                if (c - 1 >= 0 && grid[r][c - 1] == 1) {
                    queue.add(new int[]{r, c - 1});
                    grid[r][c - 1] = 2;
                    fresh--;
                    flag = true;
                }
                if (c + 1 < col  && grid[r][c + 1] == 1) {
                    queue.add(new int[]{r, c + 1});
                    grid[r][c + 1] = 2;
                    fresh--;
                    flag = true;
                }
                size--;
                queue.poll();
            }
            if(flag) {
                time++;
            }
        }
        if(fresh == 0){
            return time;
        }
        return -1;
    }

}
