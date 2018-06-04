package com.bomeng.solution8;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.myAtoi("42"));
        System.out.println(s.myAtoi("   -42"));
        System.out.println(s.myAtoi("4193 with words"));
        System.out.println(s.myAtoi("words and 987"));
        System.out.println(s.myAtoi("-91283472332"));
    }

    public int myAtoi(String str) {
        int p = 0;
        int sum = 0;
        int length = str.length();
        while (p < length && Character.isSpaceChar(str.charAt(p))) {
            p++;
        }
        if (p == str.length()) {
            return 0;
        }
        boolean negative = false;
        if (str.charAt(p) == '-') {
            negative = true;
        }
        if (str.charAt(p) == '+' || str.charAt(p) == '-') {
            p++;
        }
        while (p < length) {
            if (!Character.isDigit(str.charAt(p))) {
                break;
            } else {
                int digit = str.charAt(p) - '0';
                if (negative && sum < (Integer.MIN_VALUE + digit) / 10) {
                    return Integer.MIN_VALUE;
                } else if (!negative && sum  > (Integer.MAX_VALUE - digit) / 10) {
                    return Integer.MAX_VALUE;
                }
                sum = sum * 10 + (negative? - digit: digit);
            }
            p++;
        }
        return sum;
    }
}
