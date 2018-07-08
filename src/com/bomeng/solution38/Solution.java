package com.bomeng.solution38;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.countAndSay(1));
        System.out.println(s.countAndSay(4));
    }

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String s = countAndSay(n - 1);
        int count = 1;
        char c = s.charAt(0);
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != c) {
                builder.append(count);
                builder.append(c);
                count = 1;
                c = s.charAt(i);
            } else {
                count = count + 1;
            }
        }
        builder.append(count);
        builder.append(c);
        return builder.toString();
    }
}
