from collections import deque
from typing import List

class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        rows = len(grid)
        cols = len(grid[0])
        visited = set()
        island_count = 0

        # Directions for up, down, left, and right movements
        directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]

        def bfs(r, c):
            queue = deque([(r, c)])
            visited.add((r, c))

            while queue:
                row, col = queue.popleft()
                
                # Traverse the four possible directions
                for dr, dc in directions:
                    new_row, new_col = row + dr, col + dc
                    # Check if the new cell is within bounds and is land (1)
                    if (0 <= new_row < rows and 0 <= new_col < cols and 
                        grid[new_row][new_col] == "1" and (new_row, new_col) not in visited):
                        visited.add((new_row, new_col))
                        queue.append((new_row, new_col))

        # Traverse each cell in the grid
        for r in range(rows):
            for c in range(cols):
                # Start BFS if the cell is land and not visited
                if grid[r][c] == "1" and (r, c) not in visited:
                    bfs(r, c)
                    island_count += 1  # Count this as a new island

        return island_count
