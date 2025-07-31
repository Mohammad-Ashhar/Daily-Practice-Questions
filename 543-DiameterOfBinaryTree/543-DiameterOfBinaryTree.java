// Last updated: 31/07/2025, 21:15:50
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
// class Solution {
//     public int diameterOfBinaryTree(TreeNode root) {
//         if(root==null)
// 			{
// 				return 0;
// 			}
// 			int ld=diameterOfBinaryTree(root.left);
// 			int rd=diameterOfBinaryTree(root.right);
// 			int sd=height(root.left)+height(root.right)+1;
// 			return Math.max(sd, Math.max(rd, ld));
//     }
//     public int height(TreeNode root)
// 		{
// 			if(root==null)
// 			{
// 				return -1;
// 			}
// 			int lh=height(root.left);
// 			int rh=height(root.right);
// 			return Math.max(lh,rh) +1;
// 		}
// }

public class Solution {
    private int maxDiameter = 0;  // in edges

    public int diameterOfBinaryTree(TreeNode root) {
        computeHeight(root);
        return maxDiameter;
    }

    // returns height in edges from `node` down, and updates `maxDiameter`
    private int computeHeight(TreeNode node) {
        if (node == null) return 0;
        int lh = computeHeight(node.left);
        int rh = computeHeight(node.right);

        // path through this node (in edges) is lh + rh
        maxDiameter = Math.max(maxDiameter, lh + rh);

        return Math.max(lh, rh) + 1;
    }
}
