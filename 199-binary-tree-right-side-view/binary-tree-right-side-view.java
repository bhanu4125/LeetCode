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
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
       ArrayList<Integer> b=new ArrayList<>();
        //a.add(root.val);
        //TreeNode r=rightSideView(root.right);
        Queue<TreeNode> a=new LinkedList<>();
        a.offer(root);
        TreeNode t=null;
        while(!a.isEmpty()){
            int n=a.size();
            for(int i=0;i<n;i++){
                 t=a.poll();
                if(t.left!=null){
                    a.offer(t.left);
                }
                if(t.right!=null){
                    a.offer(t.right);
                }
            }
            b.add(t.val);

        }

        
        return b;
    }
}