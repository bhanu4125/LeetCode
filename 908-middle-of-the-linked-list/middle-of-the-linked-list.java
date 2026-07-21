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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int c=0,j=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
     // System.out.println(c);
      if(c%2==0){
        c=c/2;
        c=c+1;
     // System.out.println(c);
      }else{
        c=c/2;
        c+=1;
     // System.out.println(c);
      }
      while(j!=c-1){
        head=head.next;
        j++;
      }
        return head;
    }
}