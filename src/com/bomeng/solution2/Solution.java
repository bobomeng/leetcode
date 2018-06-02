package com.bomeng.solution2;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        ListNode node2 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        node2.next = node4;
        node4.next = node3;

        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node4 = new ListNode(4);
        node5.next = node6;
        node6.next = node4;

        ListNode node = s.addTwoNumbers(node2, node5);
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int inc = 0;
        ListNode preNode = null;
        ListNode head = null;
        while (l1 != null || l2 != null) {
            int sum = (l1 != null? l1.val : 0) + (l2 != null? l2.val : 0) + inc;
            inc = sum / 10;
            sum = sum % 10;
            ListNode node = new ListNode(sum);
            if (preNode == null) {
                preNode = node;
                head = node;
            } else {
                preNode.next = node;
                preNode = node;
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (inc != 0) {
            ListNode node = new ListNode(inc);
            preNode.next = node;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
