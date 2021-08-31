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
    public ListNode sortList(ListNode head) {
        
        if(head==null || head.next==null)return head;
        
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        temp.next = null;
        ListNode leftSide = sortList(head);
        ListNode rightSide = sortList(slow);
        return mergeList(leftSide, rightSide);
        
    }
    
    public static ListNode mergeList(ListNode x, ListNode y){
        ListNode start = new ListNode(0);
        ListNode curr = start;
