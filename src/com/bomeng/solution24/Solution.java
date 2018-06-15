package com.bomeng.solution24;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

    }

    public ListNode swapPairs(ListNode head) {
        if (head == null) return null;//base conditions
        if (head.next == null) return head;
        ListNode prev = head;
        ListNode cur = head.next;
        head = cur;
        while (true) {
            ListNode next = cur.next;
            cur.next = prev;
            if (next == null || next.next == null) {
                prev.next = next;
                break;
            }
            prev.next = next.next;
            prev = next;
            cur = prev.next;
        }
        return head;
    }
}
