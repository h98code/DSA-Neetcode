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
    public boolean isValidBST(TreeNode root) {
        return helper(root, -1001, 1001);
    }

    private boolean helper(TreeNode root, int lm, int rm) {
        if(root == null) return true;

        if(root.val <= lm || root.val >= rm) return false;

        return helper(root.left, lm, root.val) && helper(root.right, root.val, rm);
    }
}
