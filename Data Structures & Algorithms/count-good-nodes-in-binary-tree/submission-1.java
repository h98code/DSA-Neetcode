/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int goodNodes(TreeNode root) {
        int max = -101;
        int[] count = new int[1];

        helper(root, max, count);

        return count[0];
    }

    private void helper(TreeNode root, int max, int[] count) {
        if(root == null) return;

        if(root.val >= max) count[0]++;
        max = Math.max(root.val, max);

        helper(root.left, max, count);
        helper(root.right, max, count);
    }
}
