package org.example.leetcode.backTracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        System.out.println(generate(3));
    }
    static List<String> generate(int n){
    List<String> result = new ArrayList<>();
    helper(result,"",n,0,0);
    return result;
    }
    static void helper(List<String> list, String parentheses, int n, int open , int close){
        if(parentheses.length() == 2*n){
            list.add(parentheses);
            return;
        }
        if(open < n) {
            helper(list, parentheses + "(", n, open + 1, close);
        }
        if(close < open){
            helper(list,parentheses+")",n,open,close+1);
        }
    }


}
