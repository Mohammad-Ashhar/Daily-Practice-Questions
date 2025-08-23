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
    private String result=null;
    public String smallestFromLeaf(TreeNode root) {
        smallestString(root, new StringBuilder());
        return result;
    }

    private void smallestString(TreeNode node, StringBuilder path) {
        if (node == null) return;
        path.append((char) ('a' + node.val));
        if (node.left == null && node.right == null) {
            String candidate = new StringBuilder(path).reverse().toString();
            if (result == null || candidate.compareTo(result) < 0) {
                result = candidate;
            }
        } else {
            smallestString(node.left, path);
            smallestString(node.right, path);
        }
        path.deleteCharAt(path.length() - 1); 
    }
}