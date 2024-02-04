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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode tail = head;
        int size = 1;
        while(tail.next != null){
            tail = tail.next;
            size++;
        }
        k = k > size ? k % size : k;
        if(k == size){
            return head;
        }

        // finding rotation point
        ListNode temp = head;
        while(temp != null){
            ListNode firstRotatedNode = temp;
            for(int i = 0; i < k; i++){
                firstRotatedNode = firstRotatedNode.next;
            }
            if(firstRotatedNode.next == null){
                break;
            }
            temp = temp.next;
        }

        tail.next = head;
        head = temp.next;
        temp .next = null;

        return head;
    }
}