/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class LCA {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
            return root;
        if(root == p || root == q)
            return root;
        TreeNode leftLCA = lowestCommonAncestor(root.left, p,q);
        TreeNode rightLCA = lowestCommonAncestor(root.right,p,q);
        if(leftLCA!=null && rightLCA!=null)
            return root;
        return leftLCA!=null?leftLCA:rightLCA;
    }
}
