// Last updated: 31/07/2025, 21:09:00
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
    public TreeNode createBinaryTree(int[][] descriptions) {
       HashSet<Integer> child = new HashSet<>();
        HashMap<Integer, TreeNode> nodes = new HashMap<>();

        TreeNode root = null;

        for (int d[] : descriptions) {
            if (!nodes.containsKey(d[0])) {    //parent
                nodes.put(d[0], new TreeNode(d[0]));
            }
            if (!nodes.containsKey(d[1])) {    //child
                nodes.put(d[1], new TreeNode(d[1]));
            }

            //making left child
            if (d[2] == 1) {
                nodes.get(d[0]).left = nodes.get(d[1]);
                child.add(d[1]);
            }
            //making right child
            else {
                nodes.get(d[0]).right = nodes.get(d[1]);
                child.add(d[1]);
            }
        }

        for (int d[]: descriptions) {
            if (!child.contains(d[0])) {
                root = nodes.get(d[0]);
            }
        }

        return root; 
    }
}