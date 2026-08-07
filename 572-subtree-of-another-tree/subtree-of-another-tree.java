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
    public boolean isSubtree(TreeNode root, TreeNode sub) {
               if(root==null){
            return false;
        }
        if(root.val==sub.val){
            if(checkMatch(root,sub)){
                return true;
            };
        }
        if(isSubtree(root.left,sub)){
            return true;
        }
        return isSubtree(root.right,sub);

    }
    public boolean checkMatch(TreeNode root,TreeNode sub){
        if(root==null && sub==null){
            return true;
        }
        if(root==null || sub==null){
            return false;
        }
        return root.val==sub.val && checkMatch(root.left,sub.left)&& checkMatch(root.right,sub.right);
    } 
}