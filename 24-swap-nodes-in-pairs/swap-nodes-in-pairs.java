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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode p=null;
        //prev.next=head;
        ListNode f=head;
        ListNode s=head.next;
       // ListNode t=s.next;
        while(f!=null&&s!=null){
           ListNode t=s.next;
            s.next=f;
            f.next=t;
            if(p!=null){
            p.next=s;
            }else{
                head=s;
            }
            p=f;
            f=t;
            if(t!=null){
                s=t.next;
            }
        }
return head;

        }
}

        // ListNode dummy = new ListNode(0);
        // dummy.next = head;
        // ListNode prev = dummy;
        // ListNode temp = head;
        // while (temp != null && temp.next != null) {
        //     ListNode d = temp.next;
        //     temp.next = d.next;
        //     d.next = temp;
        //     prev.next = d; 
        //     prev = temp;
        //     temp = temp.next;
        // }
        // return dummy.next;
        // ListNode temp=head;
        // ListNode d=null;
        // d.next=head;
        // ListNode p=d;
        // while(temp!=null && temp.next!=null){
        //     d=temp.next;
        //     d.next=temp;
        //     p=temp;
        //     temp=temp.next;
        //     d=d.next;
        // }
        // return head;
