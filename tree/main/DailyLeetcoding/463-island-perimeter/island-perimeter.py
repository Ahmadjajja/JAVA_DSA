from typing import List

class Solution:
    def islandPerimeter(self, grid: List[List[int]]) -> int:
        directions = [[-1, 0], [1, 0], [0, -1], [0, 1]]
        perimeter = 0

        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] != 0:
                    for delR, delC in directions:
                        neiR, neiC = i + delR, j + delC
                        # Fixing the boundary check
                        if neiR < 0 or neiR >= len(grid) or neiC < 0 or neiC >= len(grid[0]) or grid[neiR][neiC] == 0:
                            perimeter += 1
        
        return perimeter
