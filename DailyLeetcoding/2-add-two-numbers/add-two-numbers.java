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

// Solution-1 
// Un-efficient method

// import java.math.BigInteger;

// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         StringBuilder num1 = new StringBuilder("");
//         StringBuilder num2 = new StringBuilder("");
//         ListNode templ1 = l1;
//         ListNode templ2 = l2;
//         while (templ1 != null) {
//             num1.insert(0, "" + templ1.val);
//             templ1 = templ1.next;
//         }
//         while (templ2 != null) {
//             num2.insert(0, "" + templ2.val);
//             templ2 = templ2.next;
//         }

//         BigInteger ans = new BigInteger(num1.toString()).add(new BigInteger(num2.toString()));
        
//         ListNode ansList = new ListNode(ans.mod(BigInteger.TEN).intValue(), null);
//         ListNode ansHead = ansList;
//         ans = ans.divide(BigInteger.TEN);
        
//         while (!ans.equals(BigInteger.ZERO)) {
//             ListNode temp = new ListNode(ans.mod(BigInteger.TEN).intValue(), null);
//             ansList.next = temp;
//             ansList = ansList.next;
//             ans = ans.divide(BigInteger.TEN);
//         }
//         return ansHead;
//     }
// }


// solution-2 -> efficient method
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1, t2 = l2, head = new ListNode(-1);
        ListNode current = head;
        int carry = 0;
        while(t1 != null || t2 != null){
            int sum = 0;
            if(t1 != null){
                sum += t1.val;
                t1 = t1.next;
            }
            if(t2 != null){
                sum += t2.val;
                t2 = t2.next;
            }

            sum += carry;
            carry = sum / 10;
            sum = sum % 10;
            ListNode temp = new ListNode(sum);
            if(current.val == -1){
                current.val = temp.val;
            } else {
                current.next = temp;
                current = current.next;
            }
        }
        if(carry != 0){
            ListNode temp = new ListNode(carry, null);
            current.next = temp;
        }
        return head;
    }
}


