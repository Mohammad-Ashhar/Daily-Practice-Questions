public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
class Solution{
    TreeNode successor=null;
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        return Successor(root,p);

    }
    public TreeNode Successor(TreeNode root,TreeNode p)
    {
        if(root==null) return null;
        if(root.val>p.val)
        {
            successor=root;
            return Successor(root.left,p);
        }
        else
        {
            return Successor(root.right,p);
        }
    }
}