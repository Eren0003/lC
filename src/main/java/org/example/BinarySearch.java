package org.example;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,14,69,99,100};
        int target = 100;
        int start = 0 ;
        int end = nums.length-1;
        int ans = binarySearch(nums,target,start,end);
        System.out.println(ans);

    }
    static int binarySearch(int[] nums,int target,int start , int end){

        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            }
            if (nums[mid] == target) {
                return mid;
            } else {
                return binarySearch(nums, target, start, end);
            }
        }
        else{
            return -1;
        }
    }
}
