package org.example;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] nums = {4,2,6};//,7,22,1,56,234,63,3,1,6,34,99,43,100};
        int end = nums.length ; int maxIndex = 0 ;int index = 0 ;
        selection(nums,index,end,maxIndex);
        System.out.println(Arrays.toString(nums));
//        int len = nums.length;
//        for(int i = 0 ; i < nums.length ; i++){
//            int maxIndex = 0;
//            for(int j = 0 ; j < len ; j++){
//                if(nums[maxIndex] < nums[j]){
//                    maxIndex = j;
//                }
//            }int temp = nums[maxIndex];
//            nums[maxIndex] = nums[len-1];
//            nums[len-1] = temp;
//            len = len-1;
//        }
//        System.out.println(Arrays.toString(nums));
    }
    static void selection(int[]nums,int index,int end,int maxIndex){
        if(end == 0){
            return;
        }
        if(index < end){
            if(nums[index] > nums[maxIndex]){
               selection(nums,index+1,end,index);
            }
            else{
                selection(nums,index+1,end,maxIndex);
            }
        }
        else{
            int temp = nums[maxIndex];
            nums[maxIndex] = nums[end-1];
            nums[end-1] = temp;
            selection(nums,0,end-1,0);
        }

    }
}
