package org.example.leetcode.stack;

import java.util.Stack;

public class Valid {
    public static void main(String[] args) {
        String s = "()))";
        System.out.println(isValid(s));
    }
    static boolean isValid(String s){
        if(s.length()%2 != 0 )return false;
        Stack<Character> stack = new Stack<>();
      for(char c : s.toCharArray()){
          if(c == '(' || c == '[' || c == '{'){
              stack.push(c);
          }
          else if(c == ')'){
              if(!stack.isEmpty() && stack.peek() == '('){
                  stack.pop();
              }else{
                  return false;
              }
          }else if(c == ']' ){
              if(!stack.isEmpty() && stack.peek() == '['){
                  stack.pop();
              }else{
                  return false;
              }
          }else if(c == '}'){
              if(!stack.isEmpty() && stack.peek() == '{'){
                  stack.pop();
              }else{
                  return false;
              }
          }
        }
      return stack.isEmpty();
    }
}
