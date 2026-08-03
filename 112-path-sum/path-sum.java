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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            return targetSum-root.val==0;
        }
        boolean l=hasPathSum(root.left,targetSum-root.val);
        boolean r=hasPathSum(root.right,targetSum-root.val);
        return l||r;
        // Queue<TreeNode> q=new LinkedList<>();
        // q.offer(root);
        //     ArrayList<Integer> a=new ArrayList<>();
        // while(!q.isEmpty()){
        // int sum=0;
        //     int t=q.size();
        //     for(int i=0;i<t;i++){
        //         TreeNode p=q.poll();
        //         a.add(p.val);
        //         if(p.left!=null){
        //             q.offer(p.left);
        //             a.add(p.left.val);
        //         }
        //         if(p.right!=null){
        //             q.offer(p.right);
        //             a.add(p.right.val);
        //         }
        //     }
        //     for(int k:a){
        //         sum+=k;
        //     }
        //     System.out.println(a);
        //     if(sum==targetSum){
        //         return true;
        //     }
        // }
        // return false;

    }
}