// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         int c=0;
//         ListNode temp;
//         temp=head;
//         while(temp!=null){
//             temp=temp.next;
//             c++;
//         }
//         //System.out.println(c);
//         temp=head;
//         if(n==1){
//             head=null;
//             return head;
//         }
//         while(temp!=null){
//             if(c==n+1){
//                 temp.next=temp.next.next;
//                 return head;
//             }
//             c--;
//             temp=temp.next;
//        // System.out.println(c);
//         }
//         //System.out.println(c);
//         return head;

//     }
// }
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head;
        for (int i = 0; i < n; i++)
            fast = fast.next;
        if (fast == null)
            return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}