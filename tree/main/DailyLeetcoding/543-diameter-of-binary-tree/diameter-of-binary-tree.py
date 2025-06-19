# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:

        maxDia = 0

        def DFS(node):
            nonlocal maxDia
            
            if not node:
                return 0
            
            left = DFS(node.left)
            right= DFS(node.right)

            maxDia = max(left + right, maxDia)

            return 1 + max(left, right)

        DFS(root)

        return maxDia
        