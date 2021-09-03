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
    public ListNode insertionSortList(ListNode head) {
        
        ListNode dummy = new ListNode(-1);
        ListNode curr = head;
        
        while(curr!=null){
            
            ListNode currNext = curr.next;
            ListNode prevNode = dummy;
            ListNode nextNode = dummy.next;
            
            while(nextNode!=null){
                
                if(nextNode.val>curr.val) break;
                prevNode = nextNode;
                nextNode = nextNode.next;
                
            }
            
            curr.next = nextNode;
            prevNode.next = curr;
            curr = currNext;
            
        }
        
        return dummy.next;
        
    }
}
