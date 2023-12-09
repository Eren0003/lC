package org.example.leetcode.mathgeometry;

import java.util.Arrays;

public class SprialMatrixII {
    public static void main(String[] args) {
        for(int[] num :(matrix(4))){
            System.out.println(Arrays.toString(num));
        }
    }
    static int[][] matrix (int n){
        int [][] matrix = new int[n][n];
        int direction = 1 ;
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        int num =  1 ;
        while(left <= right || top <= bottom){
            if(direction == 1){
                for(int i = left ; i <= right ; i++){
                    matrix[top][i] = num;
                    num++;
                }
                top++;
                direction = 2;
            }else if(direction == 2){
                for(int i = top ; i <= bottom ; i++){
                    matrix[i][right] = num;
                    num++;
                }
                right--;
                direction = 3;
            }else if(direction == 3){
                for(int i = right ; i >= left ; i--){
                    matrix[bottom][i] = num;
                    num++;
                }
                bottom--;
                direction = 4;
            }else {
                for(int i = bottom ; i >= top ; i--){
                    matrix[i][left] = num;
                    num++;
                }
                direction = 1;
                left++;
            }
        }
        return matrix;
    }
}
