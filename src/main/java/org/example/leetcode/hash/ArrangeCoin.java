package org.example.leetcode.hash;

public class ArrangeCoin {
    public static void main(String[] args) {
        int n = 15;
//        System.out.println(coin(n));
//        System.out.println(-4*-4);
    }
    static int coin(int n){
        return helper(1,n,n);
    }
    static int helper (int start , int end , int n){
        if(start==end){
            return start;
        }
        double mid = start+(end-start)/2;
        double formula = mid/2*(mid+1);
        if((int)formula == n){
            return (int)mid;
        }
        else if((int)formula < n){
            return helper((int)mid,end,n);
        }
        else{
            return helper(start,(int)mid,n);
        }
    }
}
