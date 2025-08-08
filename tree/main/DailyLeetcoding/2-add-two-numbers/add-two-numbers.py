# class Solution:
#     def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:

#         # reverse l1
#         prev1 = None
#         cur = l1
#         while cur:
#             temp = cur.next
#             cur.next = prev1
#             prev1 = cur
#             cur = temp

#         # reverse l2
#         prev2 = None
#         cur = l2
#         while cur:
#             temp = cur.next
#             cur.next = prev2
#             prev2 = cur
#             cur = temp

#         carry = 0
#         newL = ListNode()
#         cur = newL

#         while prev1 or prev2 or carry:
#             v1 = prev1.val if prev1 else 0
#             v2 = prev2.val if prev2 else 0
#             total = v1 + v2 + carry

#             cur.val = total % 10
#             carry = total // 10

#             if prev1:
#                 prev1 = prev1.next
#             if prev2:
#                 prev2 = prev2.next

#             if prev1 or prev2:
#                 cur.next = ListNode()
#                 cur = cur.next

#         return newL

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode()
        cur = dummy
        carry = 0
        
        while l1 or l2 or carry:
            v1 = l1.val if l1 else 0
            v2 = l2.val if l2 else 0
            
            total = v1 + v2 + carry
            carry = total // 10
            cur.next = ListNode(total % 10)
            cur = cur.next
            
            if l1:
                l1 = l1.next
            if l2:
                l2 = l2.next
        
        return dummy.next
