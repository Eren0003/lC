package org.example.codeWars;

import java.util.Stack;

public class ValidBraces {
    public static void main(String[] args) {
        String braces = "()(())";
        System.out.println(braces(braces));
    }
    static boolean braces(String braces){
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < braces.length() ; i++) {
            if(stack.isEmpty()){
                stack.add(braces.charAt(i));
            }
            else if(braces.charAt(i) == ')' && stack.peek() == '('){
                stack.pop();
            }else if(braces.charAt(i) == ']' && stack.peek() == '['){
                stack.pop();
            }else if(braces.charAt(i) == '}' && stack.peek() == '{'){
                stack.pop();
            }else{
                stack.add(braces.charAt(i));
            }
        }
        System.out.println(stack.size());
        if(stack.size() == 0)
            return true;
        else
            return false;
    }
}
