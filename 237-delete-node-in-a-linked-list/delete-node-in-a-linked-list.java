/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
       // Node temp=tail;
        // while(temp.val!=node){
        //     deleteNode(ListNode node)
        // }
        ListNode curr=node;
        while(curr.next!=null){
            if(curr.next.next!=null){
                curr.val=curr.next.val;
              // curr.next=null;
                curr=curr.next;
            }else{
                curr.val=curr.next.val;
                curr.next=null;
            }
            }
    }
}