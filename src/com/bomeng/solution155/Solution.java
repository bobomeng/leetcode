package com.bomeng.solution155;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class MinStack {

    /** initialize your data structure here. */
    List<Integer> valueList;
    List<Integer> minList;

    public MinStack() {
        valueList = new LinkedList<>();
        minList = new LinkedList<>();
    }

    public void push(int x) {
        valueList.add(0, x);
        if (minList.size()  == 0) {
            minList.add(x);
        } else {
            int min = Math.min(minList.get(0), x);
            minList.add(0, min);
        }
    }

    public void pop() {
        valueList.remove(0);
        minList.remove(0);
    }

    public int top() {
        return valueList.get(0);
    }

    public int getMin() {
        return minList.get(0);
    }
}

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin();  // --> Returns -3.
        minStack.pop();
        minStack.top();      // --> Returns 0.
        minStack.getMin();   // --> Returns -2.
    }
}
