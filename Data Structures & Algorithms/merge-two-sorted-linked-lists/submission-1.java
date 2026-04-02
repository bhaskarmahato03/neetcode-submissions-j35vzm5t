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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){ return list2;}
        if(list2==null){return list1;}
        ListNode curr1= list1;
        ListNode curr2= list2;
        
        if (curr1.val>curr2.val){
            curr2.next= mergeTwoLists(curr2.next, curr1);
            return  curr2;
            
        }
        else{
            curr1.next= mergeTwoLists(curr1.next, curr2);
            return curr1;
        }
        
    }
}