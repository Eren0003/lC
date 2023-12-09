package org.example.leetcode.twopointer;

import java.util.HashSet;
import java.util.Set;

public class Happy {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(happyNumber(n));
    }
    static boolean happyNumber(int n){
        Set<Integer> set = new HashSet<>();
        if(helper(n,set) == 1){
            return true;
        }
        else {
            return false;
        }
    }
    static  int helper(int n,Set<Integer> set){
        int i = n ;
        int sum = 0 ;
        while(i > 0){
            int rem = i%10;
            sum += (int)Math.pow(rem,2);
            i = i/10;
        }
        System.out.println(sum);
        if(set.contains(sum)){
            return 0;
        }else{
            set.add(sum);
        }
        if(sum == 1){
            return sum;
        }else{
            return helper(sum,set);
        }
    }
}
