package org.example.leetcode.backTracking;

import java.util.HashSet;
import java.util.Set;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},
                          {'S','F','C','S'},
                          {'A','D','E','E'}};
        System.out.println(search(board,"ABCCES"));
    }
    static boolean search(char[][] board,String word){
        int row = board.length;
        int col = board[0].length;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(dfs(i,j,0 , new HashSet<>(),word,board)){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean dfs(int row , int col , int pointer, Set<String> set , String word , char[][] board){
        if( pointer == word.length()){
            return true;
        }
        if(row < 0 || col < 0 || row >= board.length ||
                col >= board[0].length || set.contains(row+","+col) || word.charAt(pointer) != board[row][col] ){
            return false;
        }
        set.add(row+","+col);
        boolean result = (dfs(row+1,col, pointer+1,set,word,board) ||
                          dfs(row-1,col,pointer+1,set,word,board) ||
                          dfs(row , col+1,pointer+1,set,word,board) ||
                          dfs(row, col-1,pointer+1,set,word,board));
        set.remove(row+","+col);
        return result;
    }
}
