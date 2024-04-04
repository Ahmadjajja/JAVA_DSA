# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        subTree = False

        def isSameTree(p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
            # base case 
            if not p or not q:
                if not p and not q:
                    return True
                else:
                    return False
            
            if p.val != q.val:
                return False
                
            return isSameTree(p.left, q.left) and isSameTree(p.right, q.right)

        def traverseOuterTree(mRoot: Optional[TreeNode]):
            nonlocal subTree

            if not mRoot:
                return
            
            if subTree == False and isSameTree(mRoot, subRoot):
                subTree = True
            elif subTree == False:
                traverseOuterTree(mRoot.left)
                if subTree == False:
                    traverseOuterTree(mRoot.right)

        traverseOuterTree(root)

        return subTree
