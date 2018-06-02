package com.bomeng.solution1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = {2, 7, 11, 15};
        int[] result = s.twoSum(nums, 9);
        for (int i: result) {
            System.out.print(i + " ");
        }
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];
            if (map.containsKey(remain)) {
                int[] result = new int[2];
                result[0] = map.get(remain);
                result[1] = i;
                return result;
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
