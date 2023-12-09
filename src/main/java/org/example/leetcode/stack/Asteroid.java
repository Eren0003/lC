package org.example.leetcode.stack;

import java.util.Stack;

public class Asteroid {
    public static void main(String[] args) {
        int [] as  = col(new int[]{10,-2,5});
        for(int a : as){
            System.out.print(a+" ");
        }
    }
    static int[] col(int[] asteroids){
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < asteroids.length ; i++){
            if(stack.isEmpty()){
                stack.add(asteroids[i]);
            }else if((stack.peek() > 0 && asteroids[i] < 0)){
                if(stack.peek()+asteroids[i] == 0){
                    stack.pop();
                }else if(stack.peek()+asteroids[i] < 0){
                    stack.pop();
                    i--;
                }
            }else {
                stack.add(asteroids[i]);
            }
        }
        int[] result = new int[stack.size()];
        for(int i = 0 ; i < stack.size() ; i++){
            result[i]  = stack.get(i);
        }
        return result;
    }
}
