package org.example.leetcode.binarySearch;

public class FindMin {
    public static void main(String[] args) {
        int[] nums = {5,1,2,3,4};
        System.out.println(find(nums));
    }
    static int find(int[] nums){
        int start = 0 ;
        int end = nums.length-1;
        int min = Integer.MAX_VALUE;
        while(start <= end){
            int mid = start + (end-start)/2;
            min = Math.min(nums[mid],min);
            if(start == end){
                break;
            }
            if(end-start > 2) {
                if((nums[start] < nums[mid] && nums[mid] < nums[end] && nums[start] < nums[end])||
                        (nums[start] > nums[mid] && nums[mid] < nums[end] && nums[start] > nums[end])){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                min = Math.min(min,nums[start]);
                min = Math.min(min,nums[end]);
                break;
            }
        }
        return min;
    }
}
