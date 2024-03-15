# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
# class Solution:
#     def tree2str(self, root: Optional[TreeNode]) -> str:
#         ansString = []


#         def traverseDFS(cur: Optional[TreeNode]):
#             nonlocal ansString


#             if cur:
#                 ansString.append(str(cur.val))
            
#             # base condition
#             if not cur:
#                 return

    
            
#             if cur.right or cur.left:
#                 ansString.append("(")
#                 traverseDFS(cur.left)
#                 ansString.append(")")  
#                 if cur.right:
#                     ansString.append("(")
#                     traverseDFS(cur.right)
#                     ansString.append(")")
            
#         traverseDFS(root)

#         return "".join(ansString)


class Solution:
    def tree2str(self, root: Optional[TreeNode]) -> str:
        def traverse(cur: Optional[TreeNode]) -> str:
            if not cur:
                return ""
            if not cur.left and not cur.right:
                return "("+str(cur.val)+")"
            if not cur.left and cur.right:
                return "(" + str(cur.val) + "()" + traverse(cur.right) + ")"
            return "(" + str(cur.val) + traverse(cur.left)   + traverse(cur.right) + ")" 
        return traverse(root)[1:-1:] 


