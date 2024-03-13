# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
        if not root:
            return False
        
        def traverse(cur: Optional[TreeNode], sum) -> bool:
            # base condition
            if not cur:
                return False
            
            sum += cur.val

            if not cur.left and not cur.right:
                return sum == targetSum
            
            return traverse(cur.left, sum) or traverse(cur.right, sum)
        
        return traverse(root, 0)
            

