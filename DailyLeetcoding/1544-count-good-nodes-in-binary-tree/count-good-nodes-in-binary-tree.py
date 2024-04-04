# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def goodNodes(self, root: TreeNode) -> int:
        goodNodes = 0

        def dfs(cur: TreeNode, maxValue: int):
            nonlocal goodNodes

            if not cur:
                return
            
            if cur.val >= maxValue:
                goodNodes += 1
            
            maxValue = max(maxValue, cur.val)

            dfs(cur.left, maxValue)
            dfs(cur.right, maxValue)
        
        dfs(root, -10000)
        
        return goodNodes
              