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
    private int maxd=0;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>ll=new ArrayList<>();
        rightSide(root,ll,1);
        return ll;
    }
    private void rightSide(TreeNode root,List<Integer>l,int cl)
    {
        if(root==null)
        {
            return;
        }
        if(maxd<cl)
        {
            l.add(root.val);
            maxd=cl;
        }
        rightSide(root.right,l,cl+1);
        rightSide(root.left,l,cl+1);
        
    }
}