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
    private int idx=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return BSTfromPre(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);        
    }
    private TreeNode BSTfromPre(int[] preorder,int lb,int ub)
    {
        if(idx==preorder.length || preorder[idx]<lb || preorder[idx]>ub)
        {
            return null;
        }
        int val=preorder[idx++];
        TreeNode root=new TreeNode(val);
        root.left=BSTfromPre(preorder,lb,val);
        root.right=BSTfromPre(preorder,val,ub);

        return root;
    }
}