# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findBottomLeftValue(self, root: Optional[TreeNode]) -> int:
        lastIndex = -1
        leftMostValue = root.val

        def dfs(node, index):
            nonlocal lastIndex
            nonlocal leftMostValue

            if not node:
                return
            
            if node.left == None:
                if index > lastIndex:
                    leftMostValue = node.val
                    lastIndex = index
            
            dfs(node.left, index + 1)
            dfs(node.right, index + 1)

        dfs(root, 0)

        return leftMostValue
            


        