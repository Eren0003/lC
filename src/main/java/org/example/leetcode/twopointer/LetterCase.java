package org.example.leetcode.twopointer;

import java.util.ArrayList;
import java.util.List;

public class LetterCase {
    public static void main(String[] args) {
        String s = "a1b2";
        permutation(s);
    }
    static List<String> permutation(String s){
        List<String> list = new ArrayList<>();
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z' ){
//                String temp = s.substring(0,i)+
                int j = c-32;
                c = (char)j;
                System.out.println(c);
            }
            if(c >= 'A' && c <= 'Z'){
                int j = c+32;
                c = (char)j;
                System.out.println(c);
            }
        }
        return new ArrayList<>();
    }

}
