/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA.next == null && headB.next == null){
            return headA.next == headB.next && headA.val == headB.val? headA: null;
        }

        ListNode ans = null;
        ListNode tempA = headA;
        while(tempA != null){
            ListNode tempB = headB;
            while(tempB != null){
                if(tempA == tempB && tempA.val == tempB.val){
                    ans = tempA;
                    // confirmation of intersected node
                    while(tempB != null && tempA != null && tempA == tempB && tempA.val == tempB.val){
                        if(tempA.next == null && tempB.next == null){
                            return ans;
                        }
                        tempA = tempA.next;
                        tempB = tempB.next;
                    }
                }
                tempB = tempB.next;
                ans = null;
            }
            tempA = tempA.next;
        }
        return null;
    }
}