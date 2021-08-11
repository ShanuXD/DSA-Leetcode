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
    public boolean isPalindrome(ListNode head) {
        
        if (head == null || head.next == null) return true;
        
        ListNode fast = head;
        ListNode slow = head;
        
        while (fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode prev_node = null;
        ListNode next_node = null;
        while(slow != null){
            next_node = slow.next;
            slow.next = prev_node;
            prev_node = slow;
            slow = next_node;
        }
        
        while( prev_node != null){
            if(prev_node.val != head.val) return false;
            prev_node = prev_node.next;
            head = head.next;
        }
        return true;
               
        
    }
}
