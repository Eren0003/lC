package org.example.leetcode.twopointer;

public class MostWater {
    public static void main(String[] args) {
        int[] height =  {1,1};
        System.out.println(water(height));
    }
    static int water( int[] height ){
        int i = 0 ;
        int len = height.length -1 ;
        int j = len;
        int ans = 0 ;
        while(i < j){
            int distance = j - i;
            int water = Math.min(height[i],height[j])*distance;
            if(ans < water) ans = water;
            if(height[i] > height[j]) j--;
            else i++;
        }
        return ans;
    }
}
