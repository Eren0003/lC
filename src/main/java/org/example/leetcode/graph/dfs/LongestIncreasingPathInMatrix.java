package org.example.leetcode.graph.dfs;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class LongestIncreasingPathInMatrix {
    public static void main(String[] args) {
//                System.out.println(longestIncreasingPathInMatrix(new int[][]{
//                {9,9,4},
//                {6,6,8},
//                {2,1,1}
//                }));

        System.out.println(Arrays.toString(findIntersectionValues(new int[]{4,3,2,3,1},new int[]{2,2,5,2,3,6})));
    }
    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int i = 0 ;
        int [] result = new int[2];
        while(i < nums1.length || i < nums2.length){
            if(i < nums1.length){
                set1.add(nums1[i]);
            }if(i < nums2.length){
                set2.add(nums2[i]);
            }
            i++;
        }
        i = 0 ;
        while(i < nums1.length || i < nums2.length){
            if(i < nums1.length && set2.contains(nums1[i])){
                result[0] += 1;
            }if(i < nums2.length && set1.contains(nums2[i])){
                result[1] += 1;
            }
            i++;
        }
        return result;
    }
    static int longestIncreasingPathInMatrix(int[][] matrix){

        int result = 0 ;
        int[][] visited = new int[matrix.length][matrix[0].length];
        for(int [] i : visited){
            Arrays.fill(i,-1);
        }
        boolean  [][]isVisited = new boolean[matrix.length][matrix[0].length];
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                int max = dfs(matrix,i,j,isVisited,-1,visited);
                result = Math.max(result,max);
                System.out.print(max+" ");
            }
            System.out.println();
        }
        return result;
    }
    static int dfs(int[][] matrix,int i , int j , boolean [][]isVisited,int prev,int[][]visited){
        if(i == matrix.length || j == matrix[0].length || i < 0 || j < 0 || isVisited[i][j] || prev >= matrix[i][j]){
            return 0;
        }
        if(visited[i][j] != -1){
            return visited[i][j];
        }
        isVisited[i][j] = true;
        int result = dfs(matrix,i+1,j,isVisited,matrix[i][j],visited)+1;
        result = Math.max(dfs(matrix,i-1,j,isVisited,matrix[i][j],visited)+1,result);
        result = Math.max(dfs(matrix,i,j-1,isVisited,matrix[i][j],visited)+1,result);
        result = Math.max(dfs(matrix,i,j+1,isVisited,matrix[i][j],visited)+1,result);
        isVisited[i][j] = false;
        visited[i][j] = result;
        return result;
    }
}
