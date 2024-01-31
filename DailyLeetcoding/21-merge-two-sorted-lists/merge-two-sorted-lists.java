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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = null;
        ListNode mergedListHead = null;
        ListNode currentL1 = list1;
        ListNode currentL2 = list2;

        while(currentL1 != null || currentL2 != null){
            ListNode node;
            if(currentL1 != null && (currentL2 == null || currentL1.val <= currentL2.val)){
                node = new ListNode(currentL1.val);
                currentL1 = currentL1.next;
            }else {
                node = new ListNode(currentL2.val);
                currentL2 = currentL2.next;
            }
            if(mergedList == null){
                node.next = mergedList;
                mergedList = node;
                mergedListHead = node;
            } else {
                mergedList.next = node;
                mergedList = node;
            }
            
        }
        System.out.print(" END ");
        return mergedListHead;
    }
}