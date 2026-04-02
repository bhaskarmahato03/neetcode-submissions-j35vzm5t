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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode slow= head;
        ListNode fast= head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        ListNode curr2=reverse(slow.next);
        ListNode curr1=head;
        slow.next=null;

        while(curr2!= null){
            ListNode temp1= curr1.next;
            curr1.next=curr2;
            ListNode temp2= curr2.next;
            curr2.next=temp1;
            curr1=temp1;
            curr2=temp2;

        }
    }

    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev= null;
         while(curr!= null){
            ListNode curr_next= curr.next;
            curr.next= prev;
            prev=curr;
            curr=curr_next;
         }
         return prev;
        
    }

        
        
    
}
