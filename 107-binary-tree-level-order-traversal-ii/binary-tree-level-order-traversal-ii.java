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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
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
            TreeNode k=q.poll();
            b.add(k.val);
                if(k.left!=null){
                    q.offer(k.left);
                }
                if(k.right!=null){
                    q.offer(k.right);
                }
            }
            a.add(b);
        }
        Collections.reverse(a);
        return a;
    }
}