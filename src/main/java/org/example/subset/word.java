package org.example.subset;

public class word {
    public static void main(String[] args) {
        char [][] board = {{'A','B','C','E'},{'S','F','C','F'},{'A','D','E','E'}};
        String word = "ABCCED";
        int m = board.length;
        int n = board[0].length;
        boolean answer = false;
        wordSearch(board,word,m,n,0);
        System.out.println(answer);
    }

    static void wordSearch(char[][] board,String word,int m,int n,int index) {

    }
    static void next(char[][] board , int i , int j ,int m , int n,String word,int index){
        if(i==m && j==n){                                     //right down
            if(board[i-1][j] == word.charAt(index)){
                next(board,i-1,j,m,n,word,index+1);
            }
            else if(board[i][j-1] == word.charAt(index)){
                next(board,i,j-1,m,n,word,index+1);
            }
        }
        else if(i == m && j == 0){                              //left down
            if(board[i][j+1] == word.charAt(index)){
                next(board,i,j+1,m,n,word,index+1);
            }
            else if(board[i-1][j] == word.charAt(index)){
                next(board,i-1,j,m,n,word,index+1);
            }
        }else if(i == 0 && j == 0){                             //left top
            if(board[i+1][j] == word.charAt(index)){
                next(board,i+1,j,m,n,word,index+1);
            }
            else if(board[i][j+1] == word.charAt(index)){
                next(board,i,j+1,m,n,word,index+1);
            }
        }else if(i == 0 && j == n){                             // right top
            if(board[i+1][j] == word.charAt(index)){
                next(board,i+1,j,m,n,word,index);
            }else if(board[i][j-1] == word.charAt(index)){
                next(board,i,j-1,m,n,word,index);
            }
        }
    }
}
