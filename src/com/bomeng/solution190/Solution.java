package com.bomeng.solution190;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.reverseBits(43261596));
    }

    public int reverseBits(int n) {
        StringBuffer sb = new StringBuffer(Integer.toBinaryString(n));
        while (sb.length() < 32) {
            sb.insert(0, 0);
        }
        sb.reverse();
        return Integer.parseUnsignedInt(sb.toString(), 2);
    }
}
