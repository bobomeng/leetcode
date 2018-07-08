package com.bomeng.solution69;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

//        System.out.println(s.mySqrt(4));
//        System.out.println(s.mySqrt(8));
        System.out.println(s.mySqrt(2147395599));
    }

    public int mySqrt(int x) {
        int low = 1;
        int high = x;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid  < x / mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low - 1;
    }
}
