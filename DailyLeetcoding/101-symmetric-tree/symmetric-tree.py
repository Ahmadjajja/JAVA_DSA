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

        leftList = []
        rightList = []

        def traverseLeft(node: Optional[TreeNode]) -> list:
            nonlocal leftList
            # base case
            if not node:
                leftList.append(None)
                return 
            
            leftList.append(node.val)

            traverseLeft(node.left)
            traverseLeft(node.right)
            
        def traverseRight(node: Optional[TreeNode]) -> list:
            nonlocal rightList
            # base case
            if not node:
                rightList.append(None)
                return 
            
            rightList.append(node.val)

            traverseRight(node.right)
            traverseRight(node.left)
        

        traverseLeft(root.left)
        traverseRight(root.right)

        return leftList == rightList