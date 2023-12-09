package org.example.leetcode.SlidingWindow;

public class MinRotated {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        int answer = Integer.MAX_VALUE;
        minRotatedArray(nums,answer,0,nums.length-1);
        System.out.println(answer);
    }
    static void minRotatedArray(int[] nums ,int answer, int start, int end){
        int mid =  (start - end )/2 + end;
        if(start > end) return;
        if(nums[start] < nums[mid] && nums[mid] < nums[end]) {
            if(answer > nums[mid]) answer = nums[mid];
             minRotatedArray(nums,answer,start,mid);
        }else if(nums[start] < nums[end] && nums[mid] > nums[end] ||
                nums[start] > nums[end] && nums[mid] < nums[end]){
            if(answer > nums[mid]) answer = nums[mid];
            minRotatedArray(nums,answer,mid,end);
        }
    }
}
