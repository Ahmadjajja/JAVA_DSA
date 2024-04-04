# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        if not root.right and not root.left:
            return True


        def traverse(left: Optional[TreeNode], right: Optional[TreeNode]) -> bool:
            if not left and not right:
                return True

            if not left or not right:
                return False
            
            return left.val == right.val and traverse(left.left, right.right) and traverse(left.right, right.left)
            

        return traverse(root.left, root.right)