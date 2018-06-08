package com.bomeng.solution846;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] hand1 = {1,2,3,6,2,3,4,7,8};
        int W = 3;
        System.out.println(s.isNStraightHand(hand1, W));

        int[] hand2 = {1,2,3,4,5};
        W = 4;
        System.out.println(s.isNStraightHand(hand2, W));
    }

    public boolean isNStraightHand(int[] hand, int W) {
        List<Integer> list = new ArrayList<>();
        for (int i: hand) {
            list.add(i);
        }
        Collections.sort(list);

        while (!list.isEmpty()) {
            int start = list.get(0);
            for (int i = 0; i < W; i++) {
                Integer item = start + i;
                if (list.indexOf(item) != -1) {
                    list.remove(item);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
