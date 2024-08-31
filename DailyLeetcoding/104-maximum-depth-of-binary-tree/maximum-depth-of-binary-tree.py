# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        depth = 0
        ans = 0

        def dep(node):
            nonlocal depth
            nonlocal ans

            if not node:
                ans = max(ans, depth)
                return
            
            depth += 1
            
            dep(node.left)
            dep(node.right)

            depth -= 1

        dep(root)

        return ans
        