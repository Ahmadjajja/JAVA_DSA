# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def leafSimilar(self, root1: Optional[TreeNode], root2: Optional[TreeNode]) -> bool:
        def leaves (node,leafs):
          
          if not node: return
          if not node.left and not node.right: # leaf node
              leafs.append(node.val)
          
          leaves(node.left,leafs)
          leaves(node.right,leafs)
          print(f'Leaf nodes left to right are {leafs}')
          return leafs 

        return leaves(root1,[]) == leaves(root2,[])