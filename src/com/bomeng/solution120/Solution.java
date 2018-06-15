package com.bomeng.solution120;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> item = new ArrayList<>();
        item.add(2);
        list.add(item);
        item = new ArrayList<>();
        item.add(3);
        item.add(4);
        list.add(item);
        item = new ArrayList<>();
        item.add(6);
        item.add(5);
        item.add(7);
        list.add(item);
        item = new ArrayList<>();
        item.add(4);
        item.add(1);
        item.add(8);
        item.add(3);
        list.add(item);
        System.out.println(s.minimumTotal(list));
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size();
        if (row == 0) {
            return 0;
        }
        int col = triangle.get(row - 1).size();
        if (col == 0) {
            return 0;
        }
        int[][] dp = new int[row][col];
        for (int i = 0; i < row; i++) {
            List<Integer> item = triangle.get(i);
            for (int j = 0; j < item.size(); j++) {
                if (i == 0) {
                    dp[i][j] = item.get(j);
                } else {
                    int pre = 0;
                    if (j == 0) {
                        pre = dp[i - 1][0];
                    } else if (j == item.size() - 1){
                        pre = dp[i - 1][item.size() - 2];
                    } else {
                        pre = Math.min(dp[i-1][j-1], dp[i-1][j]);
                    }
                    pre = pre + item.get(j);
                    dp[i][j] = pre;
                }
            }
        }
        int result = Integer.MAX_VALUE;
        for (int j = 0; j < col; j++) {
            result = Math.min(result, dp[row - 1][j]);
        }
        return result;
    }
}
