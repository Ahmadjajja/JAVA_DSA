# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        if not subRoot:
            return True
        if not root:
            return False

        if root.val == subRoot.val and self.isSameTree(root,subRoot):
            return True
        
        return self.isSubtree(root.left, subRoot) or self.isSubtree(root.right, subRoot)
    
    def isSameTree(self, r, s):
        if not r and not s:
            return True
        if not r or not s or r.val != s.val:
            return False
        
        return self.isSameTree(r.left, s.left) and self.isSameTree(r.right, s.right) 



