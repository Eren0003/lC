package org.example.leetcode.twopointer;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5,6,7,8};
        int  k = 5;
//       array(nums,k);
        reverseArray(nums,k);
        for(int i : nums){
            System.out.print(i+" ");
        }
    }
    static void array(int[] nums,int k){
        int [] ans = new int[nums.length];
        k = k % nums.length;
        int i = 0 ;
        int index = k;
        while(i < nums.length){
            if(index >= nums.length){
                index = index%nums.length;
                ans[index] = nums[i];
            }else{
                ans[index] = nums[i];
            }
            index++;
            i++;
        }
        int j = 0 ;
        for(int num : ans){
            nums[j] = num;
            j++;
        }
    }
    static void reverseArray(int [] nums, int k){
        k = k % nums.length;
        helper(nums,0,nums.length-1);
        helper(nums,0,k-1);
        helper(nums,k,nums.length-1);
    }
    static int[] helper(int[] nums , int start ,int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }
}
