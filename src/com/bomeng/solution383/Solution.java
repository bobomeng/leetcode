package com.bomeng.solution383;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.canConstruct("a", "b"));
        System.out.println(s.canConstruct("aa", "ab"));
        System.out.println(s.canConstruct("aa", "aab"));
        System.out.println(s.canConstruct("fihjjjjei", "hjibagacbhadfaefdjaeaebgi"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] array = new int[26];
        for (Character c: magazine.toCharArray()) {
            int index = c - 'a';
            array[index] = array[index] + 1;
        }
        for (Character c: ransomNote.toCharArray()) {
            int index = c - 'a';
            array[index] = array[index] - 1;
            if (array[index] < 0) {
                return false;
            }
        }
        return true;
    }
}
