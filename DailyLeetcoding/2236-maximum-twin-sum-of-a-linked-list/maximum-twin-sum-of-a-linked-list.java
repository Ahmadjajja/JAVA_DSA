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
// //  Solution-1
// // time-complexity : O(n)
// // space-complexity: O(n)
// class Solution {
//     public int pairSum(ListNode head) {
//         int maxSum = 0, twinSum = 0, size = 0;
//         ListNode temp = head;
//         ArrayList<Integer> list = new ArrayList<>();
//         while(temp != null){
//             list.add(temp.val);
//             size++;
//             temp = temp.next;
//         }

//         temp = head;
//         for(int i = 0; i <= (size / 2) - 1; i++){
//             twinSum = temp.val + list.get(size - 1 - i);
//             if(maxSum < twinSum){
//                 maxSum = twinSum;
//             }
//             temp = temp.next;
//         }
//         return maxSum;
//     }
// }

//  Solution-1 
// time-complexity : O(n)
// space-complexity: O(1)
class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head, fast = head;
        ListNode dumy = new ListNode(0, head);
        ListNode prevS = dumy;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            prevS= prevS.next;
        }
        // reverse second half of the linkedlist
        ListNode prev= null;
        while(slow != null){
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        prevS.next = prev;
        // finding size of linkedlist
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        // finding maximum twin sum
        temp = head;
        int maxTSum = 0, twinSum = 0;
        for(int i = 0; i <= (size / 2) - 1; i++){
            twinSum = temp.val + prevS.next.val;
            if(maxTSum < twinSum){
                maxTSum = twinSum;
            }
            temp = temp.next;
            prevS = prevS.next;
        }
        return maxTSum;

    }
}