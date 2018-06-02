package com.bomeng.solution4;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(s.findMedianSortedArrays(nums1, nums2));

        int[] nums3 = {};
        int[] nums4 = {2, 3};
        System.out.println(s.findMedianSortedArrays(nums3, nums4));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        if (length % 2 == 1) {
            int index1 = 0;
            int index2 = 0;
            int count = 0;
            int median = 0;
            int target = length / 2;
            while (count <= target) {
                if (index1 < nums1.length && index2 < nums2.length) {
                    if (nums1[index1] < nums2[index2]) {
                        median = nums1[index1];
                        index1 = index1 + 1;
                    } else {
                        median = nums2[index2];
                        index2 = index2 + 1;
                    }
                } else if (index1 < nums1.length) {
                    median = nums1[index1];
                    index1 = index1 + 1;
                } else {
                    median = nums2[index2];
                    index2 = index2 + 1;
                }
                count = count + 1;
            }
            return median;
        } else {
            int index1 = 0;
            int index2 = 0;
            int count = 0;
            int value1 = Integer.MIN_VALUE;
            int value2 = Integer.MIN_VALUE;
            int value = 0;
            int target = length / 2;
            while (count <= target) {
                if (index1 < nums1.length && index2 < nums2.length) {
                    if (nums1[index1] < nums2[index2]) {
                        value = nums1[index1];
                        index1 = index1 + 1;
                    } else {
                        value = nums2[index2];
                        index2 = index2 + 1;
                    }
                } else if (index1 < nums1.length) {
                    value = nums1[index1];
                    index1 = index1 + 1;
                } else {
                    value = nums2[index2];
                    index2 = index2 + 1;
                }
                if (value1 == Integer.MIN_VALUE) {
                    value1 = value;
                } else if (value2 == Integer.MIN_VALUE) {
                    value2 = value;
                } else {
                    value1 = value2;
                    value2 = value;
                }
                count = count + 1;
            }
            return (value1 + value2) * 0.5;
        }
    }
}
