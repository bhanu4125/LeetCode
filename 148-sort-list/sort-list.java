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
    public ListNode sortList(ListNode head) {
         ArrayList<Integer> arr=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            arr.add(curr.val);
            curr=curr.next;
        }
        Collections.sort(arr);
        curr=head;
        int i=0;
        while(curr!=null){
            curr.val=arr.get(i);
            curr=curr.next;
            i+=1;
        }
        return head;
        // if(head==null||head.next==null){
        //     return head;
        // }
        // ListNode left=null;
        // ListNode right=null;

        // if(head.next)

        // ListNode t=head;
        // while(t!=null){
        //     //temp=t.next;
        // ListNode temp=head;
        //     while(temp!=null &&temp.next!=null){
        //     if(temp.val>temp.next.val){
        //         ListNode y=temp;
        //         temp.val=temp.next.val;
        //         temp.next.val=y.val;
        //     }
        //     temp=temp.next;
        //     }
        //     t=t.next;
        // }
       //return head; 
    }
}