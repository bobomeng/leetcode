package com.bomeng.solution122;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] prices1 = {7,1,5,3,6,4};
        System.out.println(s.maxProfit(prices1));

        int[] prices2 = {1, 2, 3, 4, 5};
        System.out.println(s.maxProfit(prices2));
    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int currentLow = prices[0];
        int total = 0;
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] >= prices[i - 1]) {
                profit = prices[i] - currentLow;
            } else {
                total = total + profit;
                currentLow = prices[i];
                profit = 0;
            }
        }
        total = total + profit;
        return total;
    }
}
