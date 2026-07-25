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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode q=head;
        ListNode p=head.next;
        ListNode temp=q;
        ListNode t=p;
        while(t!=null && t.next!=null){
            temp.next=temp.next.next;
            temp=temp.next;
            t.next=t.next.next;
            t=t.next;
           // System.out.println(temp.val);
        }
           // System.out.println(head.val);

           //System.out.println(t.val);
      //  head=head.next;
     // head=head.next;
        // while(t.next!=null){
        //    // System.out.println(t.val);
        // }
      temp.next=p;
        return q;
    }
}