package leetcode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Q104 {
    public int maxDepth(TreeNode root) {
         if(root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return (left == 0 || right == 0) ? left + right + 1: Math.max(left,right) + 1;
    }
}
