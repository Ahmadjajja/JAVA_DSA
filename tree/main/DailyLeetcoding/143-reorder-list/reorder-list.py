# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        """
        Do not return anything, modify head in-place instead.
        """


        # 1. reverse the 2nd half the linkedList

        slow = fast = head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
        
        cur = slow.next
        slow.next = None

        prev = None

        while cur:
            temp = cur.next
            cur.next = prev
            prev = cur
            cur = temp

        cur1 = head
        cur2 = prev

        while cur2:
            temp1 = cur1.next
            temp2 = cur2.next

            cur1.next = cur2
            cur2.next = temp1
            

            cur1 = temp1
            cur2 = temp2
        
        
            







            



        # 2. Merge the both halves

        