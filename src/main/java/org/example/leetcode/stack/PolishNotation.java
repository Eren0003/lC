package org.example.leetcode.stack;

import java.util.Stack;

public class PolishNotation {
    public static void main(String[] args) {
        String [] tokens = {"4","13","5","/","+"};
        System.out.println(polish(tokens));
    }
    static int polish(String [] tokens){
        Stack<String> stack = new Stack<>();
        int result =  0;
        for(int i = 0 ; i < tokens.length ; i++){
            int temp1 = 0;
            int temp2 = 0;
            switch(tokens[i]){
                case "+":
                    temp1 = Integer.parseInt(stack.pop());
                    temp2 = Integer.parseInt(stack.pop());
                    stack.add(String.valueOf(temp2+temp1));
                    break;
                case "-":
                    temp1 = Integer.parseInt(stack.pop());
                    temp2 = Integer.parseInt(stack.pop());
                    stack.add(String.valueOf(temp2 - temp1));
                    break;
                case "/":
                    temp1 = Integer.parseInt(stack.pop());
                    temp2 = Integer.parseInt(stack.pop());
                    stack.add(String.valueOf(temp2/temp1));
                    break;
                case "*":
                    temp1 = Integer.parseInt(stack.pop());
                    temp2 = Integer.parseInt(stack.pop());
                    stack.add(String.valueOf(temp2*temp1));
                    break;
                default:
                    stack.add(tokens[i]);
                    break;
            }
        }
        return Integer.parseInt(stack.get(0));
    }
}
