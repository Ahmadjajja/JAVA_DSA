# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def tree2str(self, root: Optional[TreeNode]) -> str:
        ansList = []
        def traverse(cur):
            nonlocal ansList

            if cur:
                ansList.append(str(cur.val))
            
            # base condition
            if not cur:
                return
            
            if cur.left or cur.right:
                ansList.append("(")
                traverse(cur.left)
                ansList.append(")")
                
                if cur.right:
                    ansList.append("(")
                    traverse(cur.right)
                    ansList.append(")")
        
        traverse(root)
        return "".join(ansList)