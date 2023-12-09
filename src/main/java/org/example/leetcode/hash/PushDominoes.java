package org.example.leetcode.hash;

import java.util.LinkedList;
import java.util.Queue;

public class PushDominoes {
    public static void main(String[] args) {
        String dominoes = ".R...L.R";
//                ".L.R...LR..L..";
                System.out.println(push(dominoes));
    }
    static String push(String dominoes){
        Queue<Character> queue = new LinkedList<>();
        String result = "";
        int start = 0 ;
        int end = 0 ;
        while(start <= dominoes.length()){
            if(dominoes.charAt(end) == '.') end++;
            if(dominoes.charAt(start) == 'L' || dominoes.charAt(end) == 'R'){

            }
        }
        return result;
    }
    static String helper(char c,int num){
        String s = "";
        for(int i = 0 ; i < num ; i++){
            s += c;
        }
        return s;
    }
}
