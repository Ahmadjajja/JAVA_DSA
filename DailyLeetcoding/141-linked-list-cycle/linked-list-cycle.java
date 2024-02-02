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
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        LinkedList<ListNode> list = new LinkedList<>();
        ListNode temp = head.next;
        list.add(head);
        while(temp != null){
            if(list.contains(temp)){
                return true;
            }
            list.add(temp);
            temp = temp.next;
        }
        return false;

    }
}