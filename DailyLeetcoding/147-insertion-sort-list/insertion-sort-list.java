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
    public ListNode insertionSortList(ListNode head) {
		// base cases
        if(head == null || head.next == null) {
            return head;
        }
        // we'd return dummy.next as the result
        ListNode dummy = new ListNode(0);
        // points to the beginning of our result list
        ListNode prev = dummy;
        
        // head refers to the current node which we would try to insert in our result list. we
        // would insert this between prev and prev.next 
        while(head != null) {
            
            // this would be the node processed in the next iteration. storing this in a temp 
            // variable as the head (ie. the node we are inserting) would be modified
            ListNode next = head.next;
            
            // bit tricky. resetting prev to the beginning of the result list only if required
            if(head.val < prev.val) {
                prev = dummy;
            }
            
            while(prev.next != null && head.val > prev.next.val) {
                prev = prev.next;
            }
			
            // the order of the next two statements is important. run it in your head
            head.next = prev.next;
            prev.next = head;
            // prev = dummy; we would do this only if required
            head = next;
        }
        return dummy.next;
    }
}

