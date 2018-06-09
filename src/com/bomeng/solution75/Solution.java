package com.bomeng.solution75;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = {1,2,0};

        s.sortColors(nums);
        for (int i: nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = low;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low = low + 1;
                mid = mid + 1;
            } else if (nums[mid] == 1) {
                mid = mid + 1;
            } else {
                swap(nums, mid, high);
                high = high - 1;
            }
        }
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
