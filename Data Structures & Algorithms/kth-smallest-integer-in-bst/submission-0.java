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

    int count;

    public int kthSmallest(TreeNode root, int k) {
        int ans[] = new int[1];
        helper(root, k, ans);

        return ans[0];
    }

    private void helper(TreeNode root, int k, int[] ans){
        if(root == null) return;

        helper(root.left, k, ans);

        count++;
        if(count == k) {
            ans[0] = root.val;
            return;
        }

        helper(root.right, k, ans);
    }
}
