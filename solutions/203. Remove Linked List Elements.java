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
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode result = new ListNode(0);
        ListNode node = result;
        
        while(head!=null){
            if(head.val !=val){
                result.next = new ListNode(head.val);
                result = result.next;
            }
            head = head.next;
        }
        
        return node.next;
        
    }
}
