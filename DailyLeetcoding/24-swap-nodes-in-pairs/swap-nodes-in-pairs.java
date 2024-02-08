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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode dumy = new ListNode(0, head);
        ListNode current = head;
        head = head.next;
        while(current != null && current.next != null){
            dumy.next = current.next;
            current.next = dumy.next.next;
            dumy.next.next = current;
            dumy = dumy.next.next;
            current = current.next;
        }
        return head;
    }
}