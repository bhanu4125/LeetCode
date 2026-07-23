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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        int count=1;
        ListNode tail=head;
        while(tail.next!=null){
            tail=tail.next;
            count+=1;
        }
        ListNode curr=head;
        k=k%count;
        if(k==0){
            return head;
        }
        for(int i=1;i<count-k;i++){
            curr=curr.next;
        }
        ListNode n=curr.next;
        curr.next=null;
        tail.next=head;
        return n;
}
}