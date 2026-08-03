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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<List<Integer>>();
        }
        boolean p=false;
       Queue<TreeNode> q=new LinkedList<>();
       q.offer(root);
       ArrayList<List<Integer>> a=new ArrayList<>();
       while(!q.isEmpty()){
        int s=q.size();
        ArrayList<Integer> h=new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode t=q.poll();
                h.add(t.val);
            if(t.left!=null){
                q.offer(t.left);
            }
            if(t.right!=null){
                q.offer(t.right);
            }
            }
        if(p==false){
        a.add(h);
            p=true;
        }else{
            Collections.reverse(h);
        a.add(h);
        p=false;
       }
    }
       return a; 
    }
}