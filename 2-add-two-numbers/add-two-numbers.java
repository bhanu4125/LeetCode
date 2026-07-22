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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode d=new ListNode();
        ListNode tail=d;
        int t=0,c=0;
        while(l1!=null || l2!=null ||c!=0){
            t=c;
           // k=y;
           if(l1!=null){
            t+=l1.val;
            l1=l1.next;
           }
           if(l2!=null){
            t+=l2.val;
            l2=l2.next;
           }
           int num=t%10;
           c=t/10;
           d.next=new ListNode(num);
           d=d.next;
        }
        return tail.next;
    }
}