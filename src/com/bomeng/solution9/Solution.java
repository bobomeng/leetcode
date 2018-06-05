package com.bomeng.solution9;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.isPalindrome(121));
        System.out.println(s.isPalindrome(-121));
        System.out.println(s.isPalindrome(10));
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        } else {
            int value = 0;
            int input = x;
            while (input != 0) {
                int d = input % 10;
                value = value * 10 + d;
                input = input / 10;
            }
            return value == x;
        }
    }
}
