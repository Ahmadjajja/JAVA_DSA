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
        ListNode dumyNode = new ListNode(0, head); // used here for edge case
        ListNode leftPrev = null;
        ListNode rightPrev = null;
        // finding size of a list
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            temp = temp.next;
            size = size + 1;
        }
        temp = head;
        for(int i = 1; i <= size; i++){
            if(i == k - 1){
                leftPrev = temp;
            }
            if(i == size - k){
                rightPrev = temp;
            }
            temp = temp.next;
        }
        // for edge case
        if(leftPrev == null){
            leftPrev = dumyNode;
        }
        if(rightPrev == null){
            rightPrev = dumyNode;
        }
        ListNode left = leftPrev.next;
        ListNode right = rightPrev.next;
        if(left == right){
            return head;
        }
        // if left and right nodes are adjacent
        if(left.next == right || right.next == left){ 
            if(left.next == right){
                // if left came before than right
                leftPrev.next = right;
                left.next = right.next;
                right.next = left;
            } else {
                // if right came before than left
                rightPrev.next = left;
                right.next = left.next;
                left.next = right;
            }
        } else {
            ListNode tempNext = left.next;
            left.next = right.next;
            right.next = tempNext;
            rightPrev.next = left;
            leftPrev.next = right; 
        }
        return dumyNode.next;
    }
}