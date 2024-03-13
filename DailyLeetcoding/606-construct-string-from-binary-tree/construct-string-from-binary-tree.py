# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def tree2str(self, root: Optional[TreeNode]) -> str:
        ansString = ""
        def traverse(cur):
            nonlocal ansString

            if cur:
                ansString += str(cur.val)
            
            # base condition
            if not cur:
                return
            
            if cur.left or cur.right:
                ansString += "("
                traverse(cur.left)
                ansString += ")"
                
                if cur.right:
                    ansString += "("
                    traverse(cur.right)
                    ansString += ")"
        
        traverse(root)
        return ansString