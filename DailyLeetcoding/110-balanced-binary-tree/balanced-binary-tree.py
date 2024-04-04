# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        if not root:
            return True

        balanced = True

        def traverseBinTree(rootNode: Optional[TreeNode]) -> int:
            nonlocal balanced

            if not rootNode:
                return 0
            
            left = traverseBinTree(rootNode.left)
            right = traverseBinTree(rootNode.right)

            if left > right:
                if left - right > 1:
                    balanced = False
            else:
                if right - left > 1:
                    balanced = False

            return max(left, right) + 1
        
        traverseBinTree(root)
        return balanced        