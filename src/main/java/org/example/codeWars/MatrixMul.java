package org.example.codeWars;

public class MatrixMul {
    public static void main(String[] args) {

        int[][] ans = mul(new int[][]{{1,2},{3,2}},new int[][]{{3,2},{1,1}});
        for(int[] a : ans){
            for(int b : a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }

    static int[][] mul(int[][] a,int[][]b){
        int [][] ans = new int[a.length][a.length];
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a.length ; j++){
                int sum = 0 ;
                for(int m = 0 ; m < a.length ; m++){
                    int temp = a[i][m]*b[m][j];
                    sum += temp ;
                }
                ans[i][j] = sum;
            }
        }
        return ans;
    }
}