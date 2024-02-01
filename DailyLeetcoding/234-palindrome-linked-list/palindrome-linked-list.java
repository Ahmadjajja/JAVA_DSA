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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        int size = 0, mid = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        if(size == 1) return true;
        if(size % 2 == 0)
            mid = size / 2;
        else 
            mid = size / 2 + 1;
        return validPalindrome(head, size, mid);
    }
    public boolean validPalindrome(ListNode head, int size, int mid){
        if( mid == 0 ){ // base condition
            return true;
        }
        ListNode temp = head;
        if(size == 2) {           
            if(temp.val != temp.next.val){
                return false;
            }
            return validPalindrome(head, 0, 0);
        } 
        if(size % 2 == 1){
            for(int i = 1; i < mid - 1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            return validPalindrome(head, size - 1, (size - 1) / 2);
        } else {
            for(int i = 1; i < mid - 1; i++){
                temp = temp.next;
            }
            if(temp.next.val != temp.next.next.val){
                return false;
            } else {
                temp.next = temp.next.next.next;
                return validPalindrome(head, size - 2, (size - 2) / 2);
            }
        }
    }
}