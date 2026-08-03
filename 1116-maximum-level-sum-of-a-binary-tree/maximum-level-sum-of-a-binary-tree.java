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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        List<List<Integer>> bfslist=new ArrayList<>();
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> lev=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode ele=q.poll();
                lev.add(ele.val);
                if(ele.left!=null){
                    q.offer(ele.left);
                }
                if(ele.right!=null){
                    q.offer(ele.right);
                }
            }
                bfslist.add(lev);
        }
        int leve=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<bfslist.size();i++){
            int sum=0;
            for(int j=0;j<bfslist.get(i).size();j++){
                sum+=bfslist.get(i).get(j);
            }
            if(sum>max){
                max=sum;
                leve=i+1;
            }
        }
        return leve;
    }
}