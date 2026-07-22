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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> a=new Stack<>();
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        temp=head;
        if(c%2==0){
            c=c/2;
       for(int i=0;i<c;i++){
        if(temp!=null){
        a.push(temp.val);
        temp=temp.next;
        }
        System.out.println(a.peek());
       }
       while(temp!=null){
        if(temp.val==a.peek()){
            temp=temp.next;
            a.pop();
        }else{
            return false;
        }
       }
        }else{
            c=c/2;
           // c=c+1;
        for(int i=0;i<c;i++){
        if(temp!=null){
        a.push(temp.val);
        temp=temp.next;
        }
       }
     temp=temp.next;
       while(temp!=null){
        if(temp.val==a.peek()){
            temp=temp.next;
            a.pop();
        }else{
            return false;
        }
       }
        }
       // System.out.print(c);
    //    temp=head;
    //    for(int i=0;i<c;i++){
    //     a.push(temp.val);
    //     temp=temp.next;
    
        return true;
    }
}