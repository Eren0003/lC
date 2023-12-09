package org.example.leetcode.twopointer;

public class SumII {
    public static void main(String[] args) {
        int[]a = {2,7,11,15};
        int [] nums = {1,2,3,4,5,6,7};//{2,1,5,6,0,9,5,0,3,8};
        int firstLen = 4,secondLen = 3;
        int target =  9 ;
        maxSumOfTwoSubset(nums,firstLen,secondLen);
//        int[] answer = sum(a , target);
//        for(int h : answer){
//            System.out.println(h);
//        }
    }

    static int[] sum(int[] array , int target){
        int [] answer = new int [2];
        int start = 0 ;
        int end = array.length-1;
        while(start < end){
            if(array[start] + array[end] == target){
                answer[0] = start+1;
                answer[1] = end+1;
                break;
            }
            else if (array[start]+array[end] > target){
                end = end-1;
            }
            else{
                start = start+1;
            }
        }
        return answer;
    }

    static int maxSumOfTwoSubset(int[] nums,int firstLen, int secondLen){

        int firstSub =  firstLen  ;
        int secondSub = nums.length  - secondLen ;
        System.out.println(firstSub+" "+secondSub);
        int firstMax = 0 ;
        int secondMax = 0 ;
        for(int i = 0 ; i < firstSub ; i++){
            firstMax = firstMax + nums[i];                             //{2,1,5,6,0,9,5,0,3,8};
        }
        for(int i = secondSub ; i < nums.length   ; i++){
            secondMax = secondMax + nums[i];
        }

//        while(firstSub < nums.length){
//            System.out.println(firstMax);
//            firstMax = firstMax - nums[firstSub-firstLen] +nums[firstSub];
//            firstSub++;
//        }
//        while(secondSub > 0){                                          //{2,1,5,6,0,9,5,0,3,8};
//            System.out.println(secondMax);
//            secondMax = secondMax + nums[secondSub-1] - nums[secondSub+secondLen-1];
//            secondSub--;
//        }
        System.out.println(secondMax);
//        System.out.println(firstMax);
//        return firstMax;
        return secondMax;
    }
}
