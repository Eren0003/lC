package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class splitString {
    public static void main(String[] args) {
        int n = 46288;int p = 3;
        System.out.println(digPow(n,p));
    }
    static int digPow(int n , int p){
        String m = String.valueOf(n);
        int sum = 0;
        int i = 0 ;
        while(i < m.length()){
            int temp = Integer.parseInt(m.charAt(i)+"");
            sum += Math.pow(temp,p);
            i++;
            p++;
        }
        if(sum%n == 0){
            return sum/n;
        }
        else{
            return -1;
        }
    }
}
