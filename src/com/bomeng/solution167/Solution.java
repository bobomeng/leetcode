package com.bomeng.solution167;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] numbers = {2,7,11,15};
        int[] result = s.twoSum(numbers, 9);
        System.out.println(result[0] + ", " + result[1]);
    }

    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        int sum = numbers[low] + numbers[high];
        while (sum != target) {
            if (sum > target) {
                high = high - 1;
            } else {
                low = low + 1;
            }
            sum = numbers[low] + numbers[high];
        }
        int[] result = new int[2];
        result[0] = low + 1;
        result[1] = high + 1;
        return result;
    }
}
