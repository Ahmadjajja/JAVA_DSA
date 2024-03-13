# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
# class Solution:
#     def minDiffInBST(self, root: Optional[TreeNode]) -> int:
#         minDiff = 1000000

#         def traverse(cur: Optional[TreeNode]):
#             nonlocal minDiff

#             # base case
#             if not cur:
#                 return
            

#             tmpLeft = cur.left
#             if cur.left:
#                 minDiff = min(minDiff, cur.val - tmpLeft.val)
#             traverse(cur.left)

#             tmpRight = cur.right
#             if cur.right:
#                 minDiff = min(minDiff, abs(cur.val - tmpRight.val))
#             traverse(cur.right)
        
#         traverse(root)
        
#         return minDiff
            


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution:
    def minDiffInBST(self, root: Optional[TreeNode]) -> int:
        prev, res = None, float("inf")

        def dfs(node):
            nonlocal prev, res
            # base case
            if not node:
                return
            
            dfs(node.left)

            if prev:
                res = min(res, node.val - prev.val)
            prev = node
            dfs(node.right)

        dfs(root)
        return res




            
