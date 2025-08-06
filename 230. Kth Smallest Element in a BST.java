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
    private int c=0;
    private int res=-1;
    public int kthSmallest(TreeNode root, int k) {
        List<Integer>ll=new ArrayList<>();
        Inorder(root,k);  
        return res; 
    }
    private boolean Inorder(TreeNode root,int k)
    {
        if(root==null)  return false;
        Inorder(root.left,k);
        c++;
        if(c==k)
        {
            res=root.val;
            return true;
        }
        return Inorder(root.right,k);

    }
}