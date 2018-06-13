package com.bomeng.solution791;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.customSortString("cbafg", "abcd"));
    }

    public String customSortString(String S, String T) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            map.put(S.charAt(i), i);
        }

        Character[] items = new Character[T.length()];
        for (int i = 0; i < T.length(); i++) {
            items[i] = T.charAt(i);
        }
        Arrays.sort(items, (o1, o2) -> {
            int value1 = 26;
            int value2 = 26;
            if (map.containsKey(o1)) {
                value1 = map.get(o1);
            }
            if (map.containsKey(o2)) {
                value2 = map.get(o2);
            }
            return value1 - value2;
        });

        StringBuilder buffer = new StringBuilder();
        for (Character item : items) {
            buffer.append(item);
        }
        return buffer.toString();
    }
}
