package org.example.leetcode.stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Temperature {
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        Stack<Integer> stack = new Stack<>();
        int [] ans = dailyTemperature(temperatures,stack);
        for(int i : ans){
            System.out.println(i);
        }
    }
    static int[] dailyTemperature(int[] temperatures,Stack<Integer> stack){
        int[] answer = new int[temperatures.length];
        for(int i = 0 ; i < temperatures.length ; i++){
            if(!stack.isEmpty()) {
                while (temperatures[stack.peek()] < temperatures[i]) {
                    answer[stack.peek()] = i - stack.peek();
                    stack.pop();
                    if(stack.isEmpty()) break;
                }
            }
                stack.add(i);
        }
        return answer;
    }

}
