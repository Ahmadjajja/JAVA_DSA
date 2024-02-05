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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // finding left previous and right next
        ListNode dumy = new ListNode(0, head);
        ListNode leftPrev = dumy;
        ListNode cur = head;
        for(int i = 0; i < left - 1; i++){
            leftPrev = leftPrev.next;
            cur = cur.next;
        }

        // Reversing list
        ListNode prev = null;
        for(int i = 1; i <= right - left + 1; i++){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        leftPrev.next.next = cur;
        leftPrev.next = prev;

        return dumy.next;
    }
}