package org.example.leetcode.stack;


import java.util.Stack;

public class ValStack {

    public static void main(String[] args) {
        int [] pu = {2,1,0};
        int [] po = {1,2,0};
        System.out.println(stack(pu,po));
    }
    static boolean stack(int[] pushed , int[] popped){
        Stack<Integer> stack = new Stack<>();
        int push = 0 ;
        int pop = 0 ;
        while (pop < popped.length || push < pushed.length){
            if(stack.isEmpty()){
                if(push >= pushed.length){
                    return false;
                }
                stack.add(pushed[push]);
                push++;
            }
            else if(stack.peek() == popped[pop]) {
                stack.pop();
                pop++;
            }else{
                if(push >= pushed.length){
                    return false;
                }
                stack.add(pushed[push]);
                push++;
            }
        }
        if(stack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
