package org.example;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int []  nums = {23,45,12,5,6,7,2,35,6};
        int index = 0;
        System.out.println(Arrays.toString(bubble(nums,index,index)));
    }
    static int[] bubble( int [] nums , int index,int counter){
        if(counter == nums.length-1){
            return nums;
        }
        if(index >= nums.length - 1){
            return bubble(nums,0 ,counter+1);
        }
        if(nums[index] > nums[index+1]){
            int temp = nums[index];
            nums[index] = nums[index+1];
            nums[index+1] = temp;
        }
        bubble(nums,index+1,counter);
        return nums;
    }
}
