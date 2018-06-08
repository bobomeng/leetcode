package com.bomeng.solution5;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.longestPalindrome("babad"));
        System.out.println(s.longestPalindrome("cbbd"));
        System.out.println(s.longestPalindrome("ab"));
        System.out.println(s.longestPalindrome("a"));
    }

    public String longestPalindrome(String s) {
        int length = s.length();
        int left = 0;
        int right = 0;
        String result = "";
        if (length <= 1) {
            return s;
        }
        char[] str = s.toCharArray();
        for (int i = 1; i < length; i++) {
            left = i - 1;
            right = i + 1;
            while (left >= 0 && right < length && str[left] == str[right]) {
                left = left - 1;
                right = right + 1;
            }
            String sub = s.substring(left + 1, right);
            if (sub.length() > result.length()) {
                result = sub;
            }

            left = i - 1;
            right = i;
            while (left >= 0 && right < length && str[left] == str[right]) {
                left = left - 1;
                right = right + 1;
            }
            sub = s.substring(left + 1, right);
            if (sub.length() > result.length()) {
                result = sub;
            }
        }
        return result;
    }
}
