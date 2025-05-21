# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        # res = 0

        # def DFS(node, counter):
        #     nonlocal res

        #     if not node:
        #         res = max(counter, res)
        #         return
            
        #     DFS(node.left, counter + 1)
        #     DFS(node.right, counter + 1)


        # DFS(root, 0)

        # return res

        # if not root:
        #     return 0
        
        # return 1 + max(self.maxDepth(root.left), self.maxDepth(root.right))

        q = deque()
        q.append([root, 1])
        res = 0

        while q:

            popedElement, depth = q.popleft()
            if popedElement:

                q.append([popedElement.left, depth + 1])
                q.append([popedElement.right, depth + 1])

                res = max(res, depth)
        
        return res
