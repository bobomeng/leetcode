package com.bomeng.solution35;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr1 = {1, 3, 5, 6};
        System.out.println(s.searchInsert(arr1, 5));
        System.out.println(s.searchInsert(arr1, 2));
        System.out.println(s.searchInsert(arr1, 7));
        System.out.println(s.searchInsert(arr1, 0));
    }

    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}
