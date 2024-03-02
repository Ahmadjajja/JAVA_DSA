# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def leafSimilar(self, root1: Optional[TreeNode], root2: Optional[TreeNode]) -> bool:
        # # Solution-1 for small number of nodes
        # def leaves (node,leafs):
          
        #   if not node: return
        #   if not node.left and not node.right: # leaf node
        #       leafs.append(node.val)
          
        #   leaves(node.left,leafs)
        #   leaves(node.right,leafs)
        #   return leafs 

        # return leaves(root1,[]) == leaves(root2,[])


        # Solution-1 for large number of nodes
      def dfs (node):
          if node:
              if not node.left and not node.right:
                  #print(f"Yielding {node.val}")
                  yield node.val # generators , 
              #print(f"Invoking yield for left for parent node {node.val}")
              yield from dfs(node.left)
              #print(f"Invoking yield for right for parent node {node.val}")
              yield from dfs(node.right)

      return list(dfs(root1)) == list(dfs(root2))