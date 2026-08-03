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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
           return new ArrayList<List<Integer>>();
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        ArrayList<List<Integer>> a=new ArrayList<>();
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> b=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode y=q.poll();
                b.add(y.val);
                if(y.left!=null){
                    q.offer(y.left);
                }
                if(y.right!=null){
                    q.offer(y.right);
                }
            }
            a.add(b);
        }
        return a;
    }
}