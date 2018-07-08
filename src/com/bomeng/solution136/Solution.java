package com.bomeng.solution136;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums1 = {2, 2, 1};
        System.out.println(s.singleNumber(nums1));

        int[] nums2 = {4,1,2,1,2};
        System.out.println(s.singleNumber(nums2));
    }

    public int singleNumber(int[] nums) {
        int s = nums[0];
        for (int i = 1; i < nums.length; i++) {
            s = s ^ nums[i];
        }
        return s;
    }
}
