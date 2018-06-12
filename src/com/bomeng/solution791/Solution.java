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
        Arrays.sort(items, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                int value1 = 26;
                int value2 = 26;
                if (map.containsKey(o1)) {
                    value1 = map.get(o1);
                }
                if (map.containsKey(o2)) {
                    value2 = map.get(o2);
                }
                return value1 - value2;
            }
        });

        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < items.length; i++) {
            buffer.append(items[i]);
        }
        return buffer.toString();
    }
}
