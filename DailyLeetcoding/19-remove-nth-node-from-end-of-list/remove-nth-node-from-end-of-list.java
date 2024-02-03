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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode prev = null;
        
        while(temp != null){
            ListNode check = temp;
            for(int i = 0; i < n; i++){
                check = check.next;
            }
            if(check == null){
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        if(prev == null){
            head = head.next;
        } else {
            prev.next = prev.next.next;
        }

        return head;
    }
}