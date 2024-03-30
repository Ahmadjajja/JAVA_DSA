# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:

        # calculating the max-height of the tree
        maxHeight = 0
        def dfsMaxHeight(cur: Optional[TreeNode], index: int):
            nonlocal maxHeight
            # base-condtion
            if not cur:
                maxHeight = max(maxHeight, index)
                return

            dfsMaxHeight(cur.left, index + 1)
            dfsMaxHeight(cur.right, index + 1)
            
        
        dfsMaxHeight(root, 0)

        # creating empty list of tree height
        ansList = [ [] for _ in range(maxHeight)]

        # storing level order values in ansList
        def dfs(cur: Optional[TreeNode], index: int):

            if not cur:
                return
            
            ansList[index].append(cur.val)
            dfs(cur.left, index + 1)
            dfs(cur.right, index + 1)
        
        dfs(root, 0)


        # reversing odd subLists to make it in zigZaf order form
        for i in range(maxHeight):
            if i % 2 == 1:
                ansList[i] = ansList[i][::-1]

        return ansList