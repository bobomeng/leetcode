package com.bomeng.solution842;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.splitIntoFibonacci("123456579"));
        System.out.println(s.splitIntoFibonacci("11235813"));
        System.out.println(s.splitIntoFibonacci("0123"));
        System.out.println(s.splitIntoFibonacci("1101111"));
    }

    public List<Integer> splitIntoFibonacci(String S) {
        List<Integer> ans = new ArrayList<>();
        dfs(ans, S, 0);
        return ans;
    }

    private boolean dfs(List<Integer> ans, String s, int start) {
        if (start == s.length() && ans.size() >= 3) {
            return true;
        }
        for (int i = start; i < s.length(); i++) {
            if (s.charAt(start) == '0' && i > start) {
                return false;
            }
            long curr = Long.parseLong(s.substring(start, i + 1));
            if (curr > Integer.MAX_VALUE) {
                return false;
            }
            if (ans.size() < 2 || curr == ans.get(ans.size() - 1) + ans.get(ans.size() - 2)) {
                ans.add((int)curr);
                if (dfs(ans, s, i + 1)) {
                    return true;
                }
                ans.remove(ans.size() - 1);
            }
        }
        return false;
    }
}
