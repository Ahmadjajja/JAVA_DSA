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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode left = head;
        ListNode right = head;
        ListNode current = head;

        // finding the left
        for(int i = 1; i < k ; i++){
            current = current.next;
        }

        left = current;
        current = current.next;

        while(current != null){
            current = current.next;
            right = right.next;
        }

        // swap the values
        int temp = left.val;
        left.val = right.val;
        right.val = temp;


        return head;
    }
}