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
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair>queue=new LinkedList<>();
        int width=0;
        queue.add(new Pair(root,0));
        while(!queue.isEmpty())
        {
            Pair start=queue.peek();
            int s=queue.size();
            Pair end=null;
            for(int i=0;i<s;i++)
            {
                end=queue.poll();
                if(end.node.left!=null)
                {
                    queue.add(new Pair(end.node.left,2*end.idx+1));
                }
                if(end.node.right!=null)
                {
                    queue.add(new Pair(end.node.right,2*end.idx+2));
                }
                width=Math.max(width,end.idx-start.idx+1);
            }       
        }
        return width; 
    }
}
    class Pair{
        TreeNode node;
        int idx;
        public Pair(TreeNode node,int idx)
        {
            this.idx=idx;
            this.node=node;
        }
    }