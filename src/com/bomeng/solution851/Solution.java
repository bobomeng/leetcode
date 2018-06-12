package com.bomeng.solution851;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[][] richer1 = {{1, 0}, {2, 1}, {3,1}, {3,7}, {4,3}, {5,3}, {6,3}};
        int[] quiet1 = {3,2,5,4,6,1,7,0};

        for (int i: s.loudAndRich(richer1, quiet1)) {
            System.out.print(i + " ");
        }
    }

    public int[] loudAndRich(int[][] richer, int[] quiet) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] item: richer) {
            int x = item[0];
            int y = item[1];

            Set<Integer> values = null;
            if (map.containsKey(y)) {
                values = map.get(y);
            } else {
                values = new HashSet<>();
            }
            values.add(x);
            map.put(y, values);
        }

        int[] answer = new int[quiet.length];
        Arrays.fill(answer, -1);
        for (int i = 0; i < quiet.length; i++)
            dfs(i, quiet, map, answer);
        return answer;
    }

    private int dfs(int node, int[] quiet, Map<Integer, Set<Integer>> map, int[] answer) {
        if (answer[node] == -1) {
            answer[node] = node;
            if (map.get(node) != null) {
                for (int child : map.get(node)) {
                    int cand = dfs(child, quiet, map, answer);
                    if (quiet[cand] < quiet[answer[node]]) {
                        answer[node] = cand;
                    }
                }
            }
        }
        return answer[node];
    }
}
