package org.example.leetcode.mathgeometry;

public class MinTimeToVisitAllPoints {
    public static void main(String[] args) {
        System.out.println(minTimeToVisitAllPoints(new int[][]{{3,2},{-2,2}}));
    }
    static int minTimeToVisitAllPoints(int[][] points) {
        int []prev = points[0];
        int time = 0 ;
        for(int i = 1 ; i < points.length ; i++){
            int x = Math.abs(prev[0]-points[i][0]);
            int y = Math.abs(prev[1]-points[i][1]);
            if(x == y){
                time += x;
            }else if(x < y){
                time += x;
                int temp = 0 ;
                if(prev[1] > points[i][1]){
                    temp = prev[1]-x;
                    temp = Math.abs(temp-points[i][1]);
                }else{
                    temp = prev[1]+x;
                    temp = Math.abs(temp-points[i][1]);
                }
                time += temp;
            }else{
                time += y;
                int temp = 0;
                if(prev[0] > points[i][0]){
                    temp = prev[0]-y;
                    temp = Math.abs(temp-points[i][0]);
                }else{
                    temp = prev[0]+y;
                    temp = Math.abs(temp-points[i][0]);
                }
                time += temp;
            }
            prev = points[i];
        }
        return time;
    }
}
