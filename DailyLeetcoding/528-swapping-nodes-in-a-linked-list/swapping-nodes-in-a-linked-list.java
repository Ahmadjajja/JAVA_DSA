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


// //  Swapping nodes
// // time complexity -> O(n)
// // space complexity -> O(1)

// class Solution {
//     public ListNode swapNodes(ListNode head, int k) {
//         ListNode dumyNode = new ListNode(0, head); // used here for edge case
//         ListNode leftPrev = null;
//         ListNode rightPrev = null;
//         // finding size of a list
//         ListNode temp = head;
//         int size = 0;
//         while(temp != null){
//             temp = temp.next;
//             size = size + 1;
//         }
//         temp = head;
//         for(int i = 1; i <= size; i++){
//             if(i == k - 1){
//                 leftPrev = temp;
//             }
//             if(i == size - k){
//                 rightPrev = temp;
//             }
//             temp = temp.next;
//         }
//         // for edge case
//         if(leftPrev == null){
//             leftPrev = dumyNode;
//         }
//         if(rightPrev == null){
//             rightPrev = dumyNode;
//         }
//         ListNode left = leftPrev.next;
//         ListNode right = rightPrev.next;
//         if(left == right){
//             return head;
//         }
//         // if left and right nodes are adjacent
//         if(left.next == right || right.next == left){ 
//             if(left.next == right){
//                 // if left came before than right
//                 leftPrev.next = right;
//                 left.next = right.next;
//                 right.next = left;
//             } else {
//                 // if right came before than left
//                 rightPrev.next = left;
//                 right.next = left.next;
//                 left.next = right;
//             }
//         } else {
//             ListNode tempNext = left.next;
//             left.next = right.next;
//             right.next = tempNext;
//             rightPrev.next = left;
//             leftPrev.next = right; 
//         }
//         return dumyNode.next;
//     }
// }

//  Swapping node's values
// time complexity -> O(n)
// space complexity -> O(1)
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode left = head;
        ListNode right = head;
        ListNode cur = head;

        for(int i = 1; i < k && cur != null; i++){
            cur = cur.next;
        }

        // If 'cur' is null, k is out of bounds, return head as no swapping can be done
        if (cur == null) {
            return head;
        }

        left = cur;
        cur = cur.next;

        while(cur != null){
            cur = cur.next;
            right = right.next;
        }
        int temp = left.val;
        left.val = right.val;
        right.val = temp;
        return head;
    }
}