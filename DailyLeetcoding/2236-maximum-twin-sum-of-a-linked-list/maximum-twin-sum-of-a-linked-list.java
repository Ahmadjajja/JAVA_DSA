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
    public int pairSum(ListNode head) {
        int maxSum = 0, twinSum = 0, size = 0;
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(temp != null){
            list.add(temp.val);
            size++;
            temp = temp.next;
        }

        temp = head;
        for(int i = 0; i <= (size / 2) - 1; i++){
            twinSum = temp.val + list.get(size - 1 - i);
            if(maxSum < twinSum){
                maxSum = twinSum;
            }
            temp = temp.next;
        }

        return maxSum;
    }
    // private int tSum(ListNode start,int size, int index){
    //     int startValue = start.val;
    //     for(int i = index; i < size - 1 - index; i++){
    //         start = start.next;
    //     }
    //     return startValue + start.val;
    // }
}