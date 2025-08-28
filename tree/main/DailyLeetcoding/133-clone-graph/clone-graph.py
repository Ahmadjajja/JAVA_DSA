"""
# Definition for a Node.
class Node:
    def __init__(self, val = 0, neighbors = None):
        self.val = val
        self.neighbors = neighbors if neighbors is not None else []
"""

from typing import Optional
class Solution:
    def cloneGraph(self, node: Optional['Node']) -> Optional['Node']:
        if not node:
            return None
        
        visited = {}
        
        def dfs(curr: 'Node') -> 'Node':
            # already cloned, return the clone
            if curr in visited:
                return visited[curr]
            
            # clone of the current node
            clone = Node(curr.val)
            visited[curr] = clone
            
            # Clone neighbors recursively
            for neighbor in curr.neighbors:
                clone.neighbors.append(dfs(neighbor))
            
            return clone
        
        return dfs(node)