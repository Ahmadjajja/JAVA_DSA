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
        
        oldToNew = {}

        def DFS(clone):

            if clone in oldToNew:
                return oldToNew[clone]

            copy = Node(clone.val)
            oldToNew[clone] = copy

            for neighbor in clone.neighbors:
                copy.neighbors.append(DFS(neighbor))
            
            return copy
            
        return DFS(node) if node else None




        