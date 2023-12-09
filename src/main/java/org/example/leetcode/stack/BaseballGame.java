package org.example.leetcode.stack;

import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {
        System.out.println(calPoint(new String[]{"5","-2","4","C","D","9","+","+"}));
    }
    static int calPoint(String[] operations){
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < operations.length ; i++){
            if(operations[i].equals("C")){
                stack.pop();
            }else if(operations[i].equals("D")){
                stack.add(2*Integer.parseInt(stack.peek())+"");
            }else if(operations[i].equals("+")){
                int first = Integer.parseInt(stack.pop());
                int second = Integer.parseInt(stack.pop());
                stack.add(second+"");
                stack.add(first+"");
                stack.add((first+second)+"");
            }else{
                stack.add(operations[i]);
            }
        }
        System.out.println(stack);
        int sum = 0 ;
        for(int i = 0 ; i < stack.size() ; i++){
            sum += Integer.parseInt(stack.get(i));
        }
        return sum;
    }
}
