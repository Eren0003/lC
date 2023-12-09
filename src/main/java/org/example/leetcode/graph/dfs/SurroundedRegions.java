package org.example.leetcode.graph.dfs;

import java.util.ArrayList;
import java.util.List;

public class SurroundedRegions {
    public static void main(String[] args) {
        solve(new char[][]{
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','O','O','X'},
                {'X','X','X','O'}
        });
    }
    static void solve(char[][] board) {
        boolean [][] isVisited = new boolean[board.length][board[0].length];
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(board[i][j] == 'O' && !isVisited[i][j]){
                    List<int[]> list =new ArrayList<>();
                    boolean flag = true;
                    dfs(board,isVisited,list,i,j);
                    for(int [] l : list){
                        if(l[0]-1 < 0 || l[0]+1 == board.length || l[1]-1 < 0 || l[1]+1 == board[0].length){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        for(int [] l : list){
                            board[l[0]][l[1]] = 'X';
                        }
                    }
                }
            }
        }
    }
    static void dfs(char[][] board,boolean[][] isVisited,List<int[]> list,int i ,int j){
        if(i == board.length || j == board[0].length || i < 0 || j < 0){
            return;
        }
        if(isVisited[i][j] || board[i][j] == 'X'){
            return;
        }
        isVisited[i][j] = true;
        list.add(new int[]{i,j});
        dfs(board,isVisited,list,i+1,j);
        dfs(board,isVisited,list,i-1,j);
        dfs(board,isVisited,list,i,j+1);
        dfs(board,isVisited,list,i,j-1);
    }

}
