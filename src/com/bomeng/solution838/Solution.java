package com.bomeng.solution838;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.pushDominoes(".L.R...LR..L.."));
        System.out.println(s.pushDominoes("RR.L"));
    }

    public String pushDominoes(String dominoes) {
        if (dominoes == null || dominoes.length() == 0) {
            return "";
        }

        int[] R = new int[dominoes.length()];
        int[] L = new int[dominoes.length()];
        Arrays.fill(R, -1);
        Arrays.fill(L, -1);
        int rightCount = -1;
        for (int i = 0; i < dominoes.length(); i++) {
            if (dominoes.charAt(i) == '.' && rightCount >= 0) {
                R[i] = rightCount;
                rightCount++;
            } else if (dominoes.charAt(i) == 'R') {
                rightCount = 1;
                R[i] = 0;
            } else if (dominoes.charAt(i) == 'L') {
                rightCount = -1;
            }
        }
        int leftCount = -1;
        for (int i = dominoes.length() - 1; i >= 0; i--) {
            if (dominoes.charAt(i) == '.' && leftCount >= 0) {
                L[i] = leftCount;
                leftCount++;
            } else if (dominoes.charAt(i) == 'L') {
                leftCount = 1;
                L[i] = 0;
            } else if (dominoes.charAt(i) == 'R') {
                leftCount = -1;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dominoes.length(); i++) {
            if (L[i] == -1 && R[i] == -1 || R[i] == L[i]) {
                sb.append(".");
            } else if (L[i] == 0 || R[i] == -1) {
                sb.append("L");
            } else if (R[i] == 0 || L[i] == -1) {
                sb.append("R");
            } else if (L[i] < R[i]) {
                sb.append("L");
            } else {
                sb.append("R");
            }
        }
        return sb.toString();
    }
}
