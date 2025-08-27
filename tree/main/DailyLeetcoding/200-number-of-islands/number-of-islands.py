import collections
from typing import List

class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        if not grid:
            return 0

        visit = set()
        totalIslands = 0
        directions = [(0,1), (1,0), (0,-1), (-1,0)]

        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if (i, j) not in visit and grid[i][j] == "1":
                    # BFS
                    q = collections.deque()
                    q.append((i, j))
                    visit.add((i, j))

                    while q:
                        r, c = q.popleft()
                        for dr, dc in directions:
                            nr, nc = r + dr, c + dc
                            if (
                                0 <= nr < len(grid) and
                                0 <= nc < len(grid[0]) and
                                (nr, nc) not in visit and
                                grid[nr][nc] == "1"
                            ):
                                q.append((nr, nc))
                                visit.add((nr, nc))

                    totalIslands += 1

        return totalIslands
