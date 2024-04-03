# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxPathSum(self, root: Optional[TreeNode]) -> int:
        res = root.val

        def dfs(cur):
            nonlocal res

            if not cur:
                return 0
            
            leftMax = dfs(cur.left)
            rightMax = dfs(cur.right)
            leftMax = max(leftMax, 0)
            rightMax = max(rightMax, 0)

            res = max(res, cur.val + leftMax + rightMax)

            return cur.val + max(leftMax, rightMax)
            
        dfs(root)
        return res