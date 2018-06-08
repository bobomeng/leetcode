package com.bomeng.solution845;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] A = {2,1,4,7,3,2,5};
        System.out.println(s.longestMountain(A));

        int[] B = {2,2,2};
        System.out.println(s.longestMountain(B));
    }

    public int longestMountain(int[] A) {
        int[] left = new int[A.length];
        int[] right = new int[A.length];

        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
        }

        for (int i = A.length - 2; i >= 0; i--) {
            if (A[i] > A[i + 1]) {
                right[i] = right[i + 1] + 1;
            }
        }

        int max = 0;
        for (int i = 1; i < A.length - 1; i++) {
            if (left[i] > 0 && right[i] > 0) {
                max = Math.max(max, left[i] + right[i] + 1);
            }
        }
        return max;
    }
}
