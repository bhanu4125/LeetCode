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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return root;
        }
        if(key<root.val){
            root.left=deleteNode(root.left,key);
        }
        else if(key>root.val){
            root.right=deleteNode(root.right,key);
        }
        else{
            if(root.left==null){
                return root.right;
            }
            if(root.right== null){
                return root.left;
            }
        TreeNode s=find(root.right);
        root.val=s.val;
        root.right=deleteNode(root.right,s.val);
        }
        return root;
    }
    public TreeNode find(TreeNode root){
        if(root==null){
            return root;
        }
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
        // if(root==null){
        //     return root;
        // }
        // if(root.val==key){
        //     if(root.left!=null)
        //     root=root.left;
        //     else if(root.right!=null)
        //     return root;
        //     else 
        //     return null;
        // }
        // else if(root.val<key){
        //     root.left=deleteNode(root.left,key);
        // }else{
        //     root.right=deleteNode(root.right,key);
        // }
        // return root;
}