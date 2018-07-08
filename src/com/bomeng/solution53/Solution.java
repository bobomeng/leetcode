package com.bomeng.solution53;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(s.maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int maxHere = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxHere = Math.max(nums[i], maxHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxHere);
        }
        return maxSoFar;
    }
}
