package org.example.leetcode.stack;

import java.util.Stack;

public class RemoveStar {
    public static void main(String[] args) {
        System.out.println(remove("leet**cod*e"));
    }
    static String remove(String s){
        Stack<Character> stack = new Stack<>();
        String result = "";
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '*' && !stack.isEmpty()){
                stack.pop();
                result = result.substring(0,result.length()-1);
            }else{
                stack.add(s.charAt(i));
                result += s.charAt(i);
            }
        }
        return result ;
    }
}
