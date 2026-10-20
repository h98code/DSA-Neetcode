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
    public boolean isBalanced(TreeNode root) {
        boolean[] ans = new boolean[1];
        ans[0] = true;

        helper(root, ans);
        return ans[0];
    }

    private int helper(TreeNode root, boolean[] ans) {
        if(root == null) return 0;

        int lh = helper(root.left, ans);
        int rh = helper(root.right, ans);

        ans[0] = (ans[0] && Math.abs(rh - lh) <= 1);
        
        return 1 + Math.max(lh, rh);
    }
}
