// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */

// // // My first-hand approach
// // class Solution {
// //     public void reorderList(ListNode head) {

// //     if(head.next == null || head.next.next == null){
// //         return;
// //     }
// //     // 1- store all nodes in ArrayList
// //     ArrayList<ListNode> list = new ArrayList<>();
// //     ListNode temp = head;
// //     while(temp != null){
// //         list.add(temp);
// //         temp = temp.next;
// //     }

// //     // 2- use two pointer approach to reorder
// //     //    according to the requirement
// //     temp = head;
// //     int start = 0, end = list.size() - 1;
// //     ListNode prev = null;
// //     while(start <= end){
// //         // start and end are equal
// //         if(start == end){
// //             ListNode startNode = list.get(start);
// //             prev.next = startNode;
// //             startNode.next = null;
// //             start = start + 1;
// //             end = end - 1;
// //         } else {
// //             ListNode startNode = list.get(start);
// //             ListNode endNode = list.get(end);
// //             if(prev != null){
// //                 prev.next = startNode;
// //             }
// //             startNode.next = endNode;
// //             prev = endNode;
// //             endNode.next = null;
// //             start = start + 1;
// //             end = end - 1;
// //         }
// //     }
// //     return;  

// //     }
// // }


// Optimized approach
class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode fast = head;
        ListNode slow = head;

        // finding middle of linkedlist using slow and fast pointer
        while(fast != null && fast.next != null){
            fast= fast.next.next;
            slow= slow.next;
        }

        // reverse the second half

        ListNode prev = null;
        ListNode current = slow.next;
        slow.next = null;

        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Merge the two halves
        ListNode sh1 = head;
        ListNode sh2 = prev;
        
        while(sh2 != null){
            ListNode nexth1 = sh1.next;
            ListNode nexth2 = sh2.next;
            sh1.next = sh2;
            sh2.next = nexth1;

            sh1 = nexth1;
            sh2 = nexth2;
        }

        return;
    }
}


