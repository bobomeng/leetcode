package com.bomeng.solution108;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = {-10,-3,0,5,9};

        s.sortedArrayToBST(nums);
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        if (nums.length == 1) {
            TreeNode node = new TreeNode(nums[0]);
            return node;
        }
        if (nums.length == 2) {
            TreeNode root = new TreeNode(nums[1]);
            TreeNode left = new TreeNode(nums[0]);
            root.left = left;
            return root;
        }
        if (nums.length == 3) {
            TreeNode root = new TreeNode(nums[1]);
            TreeNode left = new TreeNode(nums[0]);
            TreeNode right = new TreeNode(nums[2]);
            root.left = left;
            root.right = right;
            return root;
        }
        int rootIndex = nums.length / 2;
        TreeNode root = new TreeNode(nums[rootIndex]);
        int[] leftNums = new int[rootIndex];
        System.arraycopy(nums, 0, leftNums, 0, leftNums.length);
        TreeNode left = sortedArrayToBST(leftNums);
        root.left = left;
        int[] rightNums = new int[nums.length -1 - rootIndex];
        System.arraycopy(nums, rootIndex + 1, rightNums, 0, rightNums.length);
        TreeNode right = sortedArrayToBST(rightNums);
        root.right = right;
        return root;
    }
}
