package org.example.leetcode.SlidingWindow;

import java.util.Arrays;

public class koko {
    public static void main(String[] args) {
        int h = 6 ; int [] piles = {30,11,23,4,20};
        System.out.println(kokoBanana(piles,h));

    }
    static int kokoBanana(int[] piles , int h){
        Arrays.sort(piles);
        int max = piles[piles.length-1];
        int min = 1 ;
        if(piles.length == h)return max;
        int mid = (max-min)/2 + min;
        return helper(max,min,mid,piles,h);
    }
    static int helper(int max , int min ,int mid, int[] piles, int h){
        int sum = 0 ;
        System.out.println(min+" "+mid+" "+max);
        for(int i : piles){
            if(i <= mid){
                sum += 1;
            }else if(i%mid != 0){
                sum += i/mid+1;
            }else{
                sum += i/mid;
            }
        }
        if(sum == h && min == mid) {
            return mid;
        }
        else if(sum == h && min != mid){
            return helper(max,min,mid-1,piles,h);
        }
        if(sum > h){
            return helper(max,mid+1,(max-mid+1)/2 + mid+1,piles,h);
        }else{
            return helper(mid-1,min,((mid-1)-min)/2+min,piles,h);
        }
    }
}
