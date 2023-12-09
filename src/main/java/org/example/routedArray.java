package org.example;

public class routedArray {
    public static void main(String[] args) {
        int [] nums = {6,7,8,1,2,3,4,5};
        int target = 8,start = 0,end = nums.length - 1;
        int row = 5 ;
        int column = 0;
        patter(row,column);
//        System.out.println(array(nums,target,start,end));
    }
    static int array(int[] nums,int target,int start,int end) {
        int mid = start + (end - start) / 2;
        if (start <= end) {
            if (nums[mid] == target) {
                return mid;
            } else if (nums[start] <= target && nums[mid] >= target) {
                end = mid - 1;
            } else if (nums[mid] <= target && nums[end] >= target) {
                start = mid + 1;
            } else if (nums[mid] >= target && nums[end] >= target) {
                start = mid + 1;
            } else if (nums[start] >= target && nums[mid] >= target) {
                end = mid - 1;
            }
        }
        return array(nums, target, start, end);
    }
    static void patter (int row , int column){
        if(row == 0) {
            return;
        }
        if(column < row){
            patter(row, column+1);
            System.out.print("*");
        }
        else{
            patter(row - 1, 0);
            System.out.println();
        }
    }
}
