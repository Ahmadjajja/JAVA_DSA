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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1 || head == null || head.next == null) {
            return head;
        }

        int size = 0;
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            size++;
        }

        cur = head;
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;

        for (int i = 0; i < size / k; i++) {
            ListNode start = cur;
            ListNode nextGroup = cur;
            
            for (int j = 0; j < k; j++) {
                nextGroup = nextGroup.next;
            }

            ListNode p = nextGroup;
            while (cur != nextGroup) {
                ListNode next = cur.next;
                cur.next = p;
                p = cur;
                cur = next;
            }
            
            prev.next = p;
            prev = start; // Update prev to the last node of the reversed group
        }
        return dummy.next;
    }
}
