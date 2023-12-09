package org.example.codeWars;

import java.util.ArrayList;
import java.util.List;

public class Sprial {
    public static void main(String[] args) {
        int[][] a = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(sprialMatrix(a));
    }
    static List<Integer> sprialMatrix(int[][] matrix){
        int top = 0,left = 0 ; int down = matrix.length-1,right = matrix[0].length-1;
        List<Integer> list = new ArrayList<>();
        int direction = 0 ;
        while(top <= down && left <= right){
            if(direction == 0){
                for(int i = left ; i <= right ; i++){
                    list.add(matrix[top][i]);
                }
                direction = 1;
                top += 1;
            }else if(direction == 1){
                for(int i = top ; i <= down ; i++){
                    list.add(matrix[i][right]);
                }
                direction = 2;
                right -= 1;
            }else if(direction == 2){
                for(int i = right ; i >= left ; i--){
                    list.add(matrix[down][i]);
                }
                direction = 3;
                down -= 1;
            }else {
                for(int i = down ; i >= top ; i--){
                    list.add(matrix[i][left]);
                }
                direction = 0;
                left += 1;
            }
        }
        return list;
    }

}
