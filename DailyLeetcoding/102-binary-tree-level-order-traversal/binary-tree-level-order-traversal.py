# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

# depth-first solution

# class Solution:
#     def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
#         hashmap = defaultdict(list)

#         def dfs(node, level):

#             if not node:
#                 return
            
#             hashmap[level].append(node.val)

#             dfs(node.left, level + 1)
#             dfs(node.right, level + 1)

#         dfs(root, 0)

#         return hashmap.values()


# breadth-first solution
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        res = []
        q = collections.deque()
        q.append(root)

        while q:
            qLen = len(q)
            level = []

            for i in range(qLen):
                node = q.popleft()
                if node:
                    level.append(node.val)
                    q.append(node.left)
                    q.append(node.right)
            if level:
                res.append(level)
                
        return res

            


