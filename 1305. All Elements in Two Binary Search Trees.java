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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer>a=new ArrayList<>();
        List<Integer>b=new ArrayList<>();
        Inorder(root1,a);
        Inorder(root2,b);
        return Merge(a,b);        
    }
    private void Inorder(TreeNode root,List<Integer>ll)
    {
        if(root==null)  return;
        Inorder(root.left,ll);
        ll.add(root.val);
        Inorder(root.right,ll);
    }
    private List<Integer> Merge(List<Integer>a,List<Integer>b)
    {
        List<Integer> merged=new ArrayList<>();
        int i=0,j=0;
        while(i<a.size() && j<b.size())
        {
            if(a.get(i)<=b.get(j))
            {
                merged.add(a.get(i++));
            }
            else
            {
                merged.add(b.get(j++));
            }
        }
        while(i<a.size())
        {
            merged.add(a.get(i++));
        }
        while(j<b.size())
        {
            merged.add(b.get(j++));
        }
        return merged;
    }
}