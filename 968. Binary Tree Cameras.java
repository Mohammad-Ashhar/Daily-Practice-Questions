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
    int camera=0;
    public int minCameraCover(TreeNode root) {
            int c=minCamera(root);
            if(c==-1) camera++;  // for root node, if it needs a camera, we add one more camera
            return camera;
        
    }
    public int minCamera(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=minCamera(root.left);
        int right=minCamera(root.right); 
        if(left==-1||right==-1)  //is node ko camera chahiye
        {
            camera++;
            return 1; //camera setup kra is node pe
        }
        if(left==1 ||right==1)  // kisis ek ke paas ya dono ke pass camera h or inme se koi covered h aur ek ke pass camera h
        {
            return 0; //iska matlab covereed hoo
        }
        else {
            return -1; //nees a camera
        }
    }
}