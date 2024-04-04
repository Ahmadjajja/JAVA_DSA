# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        
        maxLen = 0

        def maxDep(sRoot: Optional[TreeNode], counter):
            nonlocal maxLen

            # base case
            if not sRoot:
                maxLen = max(maxLen, counter)
                return
            
            maxDep(sRoot.left, counter + 1)
            maxDep(sRoot.right, counter + 1)
        
        maxDep(root, 0)

        return maxLen
