package com.leet.problems;


public class BuySellStock {
    public int maxProfit(int[] prices) {
        int maxProfit= 0;
        int i = 0;
        int j = 1;
        while (j < prices.length){
            if(prices[i] < prices[j]){
                int profit = prices[j] - prices[i];
                maxProfit=Math.max(maxProfit, profit);
            } else {
                i=j;
            }
            j++;
        }

        return maxProfit;
    }

    public static void main(String [] args) {
        //System.out.println(new BuySellStock().maxProfit(new int[]{7,1,5,3,6,4}));
        //System.out.println(new BuySellStock().maxProfit(new int[]{7,6,4,3,1}));
        //System.out.println(new BuySellStock().maxProfit(new int[]{2,4,1}));
        //System.out.println(new BuySellStock().maxProfit(new int[]{1,1,0}));
        System.out.println(new BuySellStock().maxProfit(new int[]{1,2,4,2,5,7,2,4,9,0,9}));

    }
}
