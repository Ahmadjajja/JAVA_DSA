from collections import deque
from typing import List

class Solution:
    def updateMatrix(self, mat: List[List[int]]) -> List[List[int]]:
        rows, cols = len(mat), len(mat[0])
        ans = [[0] * cols for _ in range(rows)]
        q = deque()
        directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]
        visited = set()
        
        # Initialize queue with all 0 cells and set their distance in ans to 0
        for i in range(rows):
            for j in range(cols):
                if mat[i][j] == 0:
                    q.append([i, j, 0])
                    visited.add((i, j))
        
        # BFS from all 0 cells simultaneously
        while q:
            r, c, dist = q.popleft()
            ans[r][c] = dist
            
            for dr, dc in directions:
                nr, nc = r + dr, c + dc
                if 0 <= nr < rows and 0 <= nc < cols and (nr, nc) not in visited:
                    visited.add((nr, nc))
                    q.append([nr, nc, dist + 1])

        
        return ans
