package org.example.leetcode.SlidingWindow;

public class NumSubArray {
    public static void main(String[] args) {
        int[] arr = {30,11,23,4,20};
        int k = 3;
        int threshold = 5;
        System.out.println(num(arr,k,threshold));
    }
    static int num(int[] arr,int  k, int threshold){
        int temp = 0 ;
        int ans = 0 ;
        int i = 0 ;
        for(int j = 0 ; j < k ; j++){
            temp += arr[j];
        }
        if(temp/k >= threshold){
            ans = 1;
        }
        while(i < arr.length-k){
            temp = temp - arr[i] + arr[i+k];
            System.out.println(arr[i]+" "+temp+" "+arr[i+k]);
            if(temp/k >= threshold){
                System.out.println(temp/k);
                ans += 1;
            }
            i++;
        }
        return ans;
    }
}
