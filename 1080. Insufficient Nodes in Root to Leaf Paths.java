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
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        return sufficient(root,0L,limit);        
    }
    private TreeNode sufficient(TreeNode root,long sum,int limit)
    {
        if(root==null) return null;
        sum+=root.val;
        // only leaf
        if (root.left == null && root.right == null) return (sum < limit) ? null : root;
        root.left=sufficient(root.left,sum,limit);
        root.right=sufficient(root.right,sum,limit);
        // both children
        if(root.left==null && root.right==null) return null;
        return root;
    }
}