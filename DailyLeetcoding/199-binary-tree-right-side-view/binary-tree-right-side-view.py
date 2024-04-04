# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        ans = []
        def traverse(cur: Optional[TreeNode], index):

            if not cur:
                return
            
            if len(ans) > index:
                ans[index] = cur.val
            else:
                ans.append(cur.val)

            traverse(cur.left, index + 1)
            traverse(cur.right, index + 1)

        traverse(root, 0)
        return ans