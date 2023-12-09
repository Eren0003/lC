package org.example.leetcode.stack;

import java.util.Stack;

public class ValidStack {
    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,5,3,2,1};
        System.out.println(validStackSeq(pushed,popped));
    }
    static boolean validStackSeq(int[] pushed ,int [] popped){
        Stack<Integer> stack = new Stack<>();
        int i = 0 ;
        int j = 0 ;
        while(j < pushed.length){
            if(i < pushed.length) {
                stack.push(pushed[i]);
            }
            if (i < pushed.length) {
               if(pushed[i] == popped[j]){
                   stack.pop();
                    j++;
               }
            }
            else{
                if(stack.peek() == popped[j]){
                    stack.pop();
                    j++;
                }else{
                    return false;
                }
            }
            System.out.println(stack);
            i++;
        }
        return true;
    }


}
