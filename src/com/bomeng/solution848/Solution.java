package com.bomeng.solution848;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] shifts1 = {3, 5, 9};
        System.out.println(s.shiftingLetters("abc", shifts1));


        int[] shifts2 = {505870226,437526072,266740649,224336793,532917782, 311122363,567754492,
                595798950,81520022, 684110326,137742843,275267355,856903962,148291585,919054234,
                467541837,622939912,116899933,983296461,536563513};
        System.out.println(s.shiftingLetters("mkgfzkkuxownxvfvxasy", shifts2));
    }

    public String shiftingLetters(String S, int[] shifts) {
        if (shifts.length == 0) {
            return S;
        }
        int sum = shifts[shifts.length - 1] % 26;
        for (int i = shifts.length - 2; i >= 0; i--) {
            sum = sum + shifts[i] % 26;
            shifts[i] = sum % 26;
        }

        char[] items = S.toCharArray();
        for (int i = 0; i < items.length; i++) {
            items[i] = (char)((items[i] - 'a' + shifts[i]) % 26 + 'a');
        }

        return String.valueOf(items);
    }
}
