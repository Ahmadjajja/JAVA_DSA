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
    public void reorderList(ListNode head) {
    if(head.next == null || head.next.next == null){
        return;
    }
    // 1- store all nodes in ArrayList
    ArrayList<ListNode> list = new ArrayList<>();
    ListNode temp = head;
    while(temp != null){
        list.add(temp);
        temp = temp.next;
    }

    // 2- use two pointer approach to reorder
    //    according to the requirement
    temp = head;
    int start = 0, end = list.size() - 1;
    ListNode prev = null;
    while(start <= end){
        // start and end are equal
        if(start == end){
            ListNode startNode = list.get(start);
            prev.next = startNode;
            startNode.next = null;
            start = start + 1;
            end = end - 1;
        } else {
            ListNode startNode = list.get(start);
            ListNode endNode = list.get(end);
            if(prev != null){
                prev.next = startNode;
            }
            startNode.next = endNode;
            prev = endNode;
            endNode.next = null;
            start = start + 1;
            end = end - 1;
        }
    }
    return;  
    }
}