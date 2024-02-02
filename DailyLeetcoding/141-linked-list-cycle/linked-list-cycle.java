/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    // Time complexity -> O(n)
    // Space complexity -> O(n)

    // public boolean hasCycle(ListNode head) {
    //     if(head == null || head.next == null){
    //         return false;
    //     }
    //     LinkedList<ListNode> list = new LinkedList<>();
    //     ListNode temp = head.next;
    //     list.add(head);
    //     while(temp != null){
    //         if(list.contains(temp)){
    //             return true;
    //         }
    //         list.add(temp);
    //         temp = temp.next;
    //     }
    //     return false;
    // }

    // Time complexity -> O(n)
    // Space complexity -> O(1)

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            // If match, cycle detected
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}