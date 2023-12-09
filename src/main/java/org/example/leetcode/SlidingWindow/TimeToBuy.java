package org.example.leetcode.SlidingWindow;

public class TimeToBuy {
    public static void main(String[] args) {
        int [] prices = {1,2,4,2,5,7,2,4,9,0,9};
        System.out.println(timeToBuy(prices));
    }
    static int timeToBuy(int[] prices){
        int i = 0;
        int j = i+1;
        int maxProfit = 0 ;
        while(j < prices.length){
            int profit = prices[j] - prices[i];
            maxProfit = Math.max(profit,maxProfit);
            if(prices[i] < prices[j]){
                j++;
            }else if(j == i+1){
                i++;
                j++;
            }else{
                i++;
            }
        }
        return maxProfit;
    }
}
