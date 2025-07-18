# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':



        def DFS(node):

            if not node:
                return [False, None]

            
            
            left = DFS(node.left)
            right = DFS(node.right)

            if left[0] and left[1]:
                return left
            
            if right[0] and right[1]:
                return right

            # case 1
            if left[0] and right[0]:
                return [True, node]


            # case 2
            if node.val == p.val or node.val == q.val:
                if left[0] or right[0]:
                    return [True, node]
            

            return [node.val == p.val or node.val == q.val or left[0] or right[0], None]
        
        return DFS(root)[1]
        