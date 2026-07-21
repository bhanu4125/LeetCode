/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        String g="";
        while(temp!=null){
            g+=temp.val;
            temp=temp.next;
        }
       // System.out.print(g);
        if(g.length()==0){
            return 0;
        }
        int d=Integer.parseInt(g,2);
        return d;  
    }
}