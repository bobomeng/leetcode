package com.bomeng.solution141;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

    }

    public boolean hasCycle(ListNode head) {
        ListNode slower = head;
        ListNode faster = head;

        while (faster != null && faster.next != null) {
            slower = slower.next;
            faster = faster.next.next;
            if (slower == faster)
                return true;
        }
        return false;
    }
}
