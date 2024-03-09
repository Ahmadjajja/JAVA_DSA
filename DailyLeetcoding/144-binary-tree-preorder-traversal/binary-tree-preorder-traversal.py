# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

# # Recursive solution
# class Solution:
#     def preorderTraversal(self, root: TreeNode) -> List[int]:
#         res = []
#         if not root:
#             return res

#         res.append(root.val)
#         res += self.preorderTraversal(root.left)
#         res += self.preorderTraversal(root.right)

#         return res

# Iterative solution
# Recursive solution
class Solution:
    def preorderTraversal(self, root: TreeNode) -> List[int]:
        cur, stack = root, []
        res = []

        while cur or stack:
            if cur: 
                res.append(cur.val)
                stack.append(cur.right)
                cur = cur.left
            else:
                cur = stack.pop()
        return res