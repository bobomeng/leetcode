package com.bomeng.solution3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        String[] strs = {"abcabcbb", "bbbbb", "pwwkew"};
        for (String i: strs) {
            System.out.print(s.lengthOfLongestSubstring(i) + " ");
        }
    }

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] str = s.toCharArray();
        int head = 0;
        int max = 0;

        for (int i = 0; i < str.length; i++) {
            if (map.containsKey(str[i])) {
                int pos = map.get(str[i]);
                for (int j = head; j < pos; j++) {
                    map.remove(str[j]);
                }
                map.put(str[i], i);
                head = pos + 1;
            } else {
                map.put(str[i], i);
                max = Math.max(max, map.size());
            }
        }
        return max;
    }
}
