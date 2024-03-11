# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right


# # Brute-Force Solution
# class Solution:
#     def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
#         if not root:
#             return 0
        
#         diameter = 0
#         maxLen = 0

#         # traversing binTree to find diamter at each node
#         def traverseBinTree(rNode: Optional[TreeNode]):
#             nonlocal diameter
#             nonlocal maxLen
#             # base case
#             if not rNode:
#                 return

#             # calculating diameter on each call
#             if rNode.left:
#                 maxDep(rNode.left, 0)
#                 left = maxLen
#                 maxLen = 0
#             else:
#                 left = 0

#             if rNode.right:
#                 maxDep(rNode.right, 0)
#                 right = maxLen
#                 maxLen = 0
#             else:
#                 right = 0

#             diameter = max(diameter, left + right)

#             traverseBinTree(rNode.left)
#             traverseBinTree(rNode.right)
        
#         # finding depth of a tree
#         def maxDep(sRoot: Optional[TreeNode], counter):
#             nonlocal maxLen

#             # base case
#             if not sRoot:
#                 maxLen = max(maxLen, counter)
#                 return
            
#             maxDep(sRoot.left, counter + 1)
#             maxDep(sRoot.right, counter + 1)

        
#         traverseBinTree(root)
#         return diameter



# Efficient approach
class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0

        diameter = 0

        def traverseBinTree(rootNode: Optional[TreeNode]) -> int:
            nonlocal diameter

            if not rootNode:
                return 0
            
            left = traverseBinTree(rootNode.left)
            right = traverseBinTree(rootNode.right)

            diameter = max(diameter, left + right)

            return max(left, right) + 1
        
        traverseBinTree(root)

        return diameter
