/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode node  = new ListNode(0);
        ListNode head  = node;
        int carry = 0;
        while(l1!=null || l2!=null || carry!=0){
            int listOneValue=0, ListTwoValue=0;
            
            if(l1!=null){
                listOneValue = l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                ListTwoValue = l2.val;
                l2=l2.next;
            }
            int total = listOneValue+ListTwoValue+carry;
            int rem = total%10;
            carry = total/10;
            
            ListNode dummy = new ListNode(rem);
            node.next = dummy;
            node = node.next;
        }
        
        return head.next;
        
    }
}
