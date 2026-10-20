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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int pst = 0, pend = preorder.length - 1;
        int ist = 0, iend = inorder.length - 1;

        return helper(preorder, pst, pend, inorder, ist, iend);
    }

    private TreeNode helper(int[] p, int ps, int pe, int in[], int is, int ie) {

        if(ps > pe || is > ie) return null;

        TreeNode root = new TreeNode(p[ps]);

        int ind = -1;
        for(int i=is; i<=ie; i++){
            if(in[i] == p[ps]) {
                ind = i;
                break;
            }
        }

        int nl = ind - is;
        root.left = helper(p, ps + 1, ps + nl, in, is, ind - 1);
        root.right = helper(p, ps + nl + 1, pe, in, ind + 1, ie);

        return root;
    }
}

