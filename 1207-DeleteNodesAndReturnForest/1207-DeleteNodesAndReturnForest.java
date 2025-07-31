// Last updated: 31/07/2025, 21:13:44
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
    List<TreeNode> arr;
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        arr = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i : to_delete)
        {
            set.add(i);
        }
        TreeNode r = del(root, set);
        if(r != null)
        {
            arr.add(r);
        }
        return arr;
    }
    public TreeNode del(TreeNode root, Set<Integer> set)
    {
        if(root == null)
        {
            return root;
        }
        TreeNode l = del(root.left, set);
        TreeNode r = del(root.right, set);
        if(set.contains(root.val))
        {
            if(l != null)
            {
                arr.add(l);
            }
            if(r != null)
            {
                arr.add(r);
            }
            return null;
        }
        root.left = l;
        root.right = r;
        return root;
    }
}