package com.bomeng.solution121;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] prices = {7,1,5,3,6,4};
        System.out.println(s.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int currentLow = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > currentLow) {
                max = Math.max(max, prices[i] - currentLow);
            }
            currentLow = Math.min(currentLow, prices[i]);
        }
        return max;
    }
}
