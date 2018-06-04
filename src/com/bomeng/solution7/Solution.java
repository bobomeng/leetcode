package com.bomeng.solution7;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.reverse(123));
        System.out.println(s.reverse(-123));
        System.out.println(s.reverse(1534236469));
    }

    public int reverse(int x) {
        int out = 0;
        boolean positive = (x >= 0);
        x = positive? x: -x;
        while (x != 0) {
            int d = x % 10;
            x = x / 10;
            if (positive && out > (Integer.MAX_VALUE - d) / 10 ||
                    !positive && -out < (Integer.MIN_VALUE + d) / 10) {
                return 0;
            } else {
                out = out * 10 + d;
            }
        }
        return positive? out: -out;
    }
}
