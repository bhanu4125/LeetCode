/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        // while(s.next!=null){
        // if(f.next.next!=null && s.next!=null)
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                return true;
            }
        }
        // if(f.next==null){
        //     f.next=s;
        //     return true;
        // }
        // while(s.next!=null){
        // }

    return false;
}
}