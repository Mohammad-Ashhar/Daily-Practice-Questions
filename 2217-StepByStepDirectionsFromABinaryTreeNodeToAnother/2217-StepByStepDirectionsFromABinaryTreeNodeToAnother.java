// Last updated: 31/07/2025, 21:09:31
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
    public String getDirections(TreeNode root, int startValue, int destValue) {
        if(root == null){
            return "";
        }

        ArrayList<String> leftRoute = new ArrayList<>();
        ArrayList<String> rightRoute = new ArrayList<>();
        

        findPath(root, startValue, leftRoute);
        findPath(root, destValue, rightRoute);


        int i =0;
        while(i<leftRoute.size() && i<rightRoute.size() && leftRoute.get(i).equals(rightRoute.get(i))){
            i++;
        }

        String result = "";
        for(int j = i; j<leftRoute.size(); j++){
            result += "U";
        }
        for(int k = i; k<rightRoute.size(); k++){
            result += rightRoute.get(k);
        }
        
        return result;
    }
    private boolean findPath(TreeNode root, int target, ArrayList<String> path){
        if(root == null){
            return false;
        }

        if(root.val  == target){
            return true;
        }

        path.add("L");
        if(findPath(root.left, target, path)){
            return true;
        }

        path.remove(path.size()-1);

        path.add("R");
        if(findPath(root.right, target, path)){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
}