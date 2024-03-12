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

#         def POT(sRoot: TreeNode):

#             # base condition
#             if not sRoot:
#                 return
            
#             res.append(sRoot.val)
#             POT(sRoot.left)
#             POT(sRoot.right)
#         POT(root)

#         return res

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













