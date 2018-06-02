package com.bomeng.solution6;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.convert("PAYPALISHIRING", 3));
        System.out.println(s.convert("PAYPALISHIRING", 4));
    }

    public String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }
        List<Character>[] rows = new List[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new ArrayList<>();
        }
        int rowIndex = 0;
        int inc = 1;
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            rows[rowIndex].add(c);
            if (rowIndex == numRows - 1) {
                inc = -1;
            } else if (rowIndex == 0) {
                inc = 1;
            }
            rowIndex = rowIndex + inc;
        }
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < rows[i].size(); j++) {
                buffer.append(rows[i].get(j));
            }
        }
        return buffer.toString();
    }
}
