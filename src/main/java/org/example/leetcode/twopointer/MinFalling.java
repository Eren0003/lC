package org.example.leetcode.twopointer;

public class MinFalling {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(minFallingPath(matrix));
    }
    static int minFallingPath(int[][] matrix){

        for(int i = matrix.length-2 ; i >= 0 ; i--){
            for(int j = matrix.length-1 ; j >= 0 ; j--){
                if(j == 0){
                    if(matrix[i+1][j] > matrix[i+1][j+1]){
                        matrix[i][j] += matrix[i+1][j+1];
                    }else{
                        matrix[i][j] += matrix[i+1][j];
                    }
                }else if(j == matrix.length-1){
                    if(matrix[i+1][j] > matrix[i+1][j-1]){
                        matrix[i][j] += matrix[i+1][j-1];
                    }else{
                        matrix[i][j] += matrix[i+1][j];
                    }
                }else{
                    if(matrix[i+1][j] <= matrix[i+1][j+1] && matrix[i+1][j] <= matrix[i+1][j-1]){
                        matrix[i][j] += matrix[i+1][j];
                    }else if(matrix[i+1][j+1] <= matrix[i+1][j] && matrix[i+1][j+1] <= matrix[i+1][j-1]){
                        matrix[i][j] += matrix[i+1][j+1];
                    }else{
                        matrix[i][j] += matrix[i+1][j-1];
                    }
                }
            }
        }int min = Integer.MAX_VALUE;
       for(int i = 0 ; i < matrix.length ; i++){
           if(min > matrix[0][i]){
               min = matrix[0][i];
           }
       }
        return min;
    }
}
