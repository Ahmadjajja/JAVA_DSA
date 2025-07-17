# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        # Edge case: only one node
        if head.next is None:
            return None

        # First pass to count the total number of nodes
        count = 0
        cur = head
        while cur:
            cur = cur.next
            count += 1

        # If we need to remove the head
        if count == n:
            return head.next

        # Find the node just before the one to delete
        cur = head
        for i in range(count - n - 1):
            cur = cur.next

        # Remove the nth node from end
        cur.next = cur.next.next

        return head

        