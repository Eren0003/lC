package org.example.leetcode.SlidingWindow;

import java.util.*;

public class MaxSlide {
    public static void main(String[] args) {
        int[] nums = {1, -1};
        int k = 3;
        int [] ans = maxSlide(nums, k);
        for(int i : ans){
            System.out.println(i);
        }
    }

    static int[] maxSlide(int[] nums, int k) {
        Queue<Integer> queue = new LinkedList<>();
        k--;
        if(nums.length == 1 && k == 1) return nums;
        int[] ans = new int[nums.length - k];
        int max = 0;
        nums[0] = max;
        int i = 0;
        int index = 0;
        while (i < nums.length) {
            while (!queue.isEmpty() && queue.peek() < i-k ) {
                queue.poll();
            }
            if (queue.isEmpty()) {
                queue.add(i);
            } else {
                if (nums[queue.peek()] > nums[i]) {
                    queue.add(i);
                } else {
                    while (!queue.isEmpty()) {
                        queue.poll();
                    }
                    queue.add(i);
                }
            }
            System.out.println(queue);
            if(i-k >= 0){
                ans[i-k] = nums[queue.peek()];
            }
            i++;
        }
        return ans;
    }
}
