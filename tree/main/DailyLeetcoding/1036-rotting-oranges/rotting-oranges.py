class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        FOC = 0
        minMin = 0

        q = collections.deque()

        rows, cols = len(grid), len(grid[0])
        directions = [[0, 1], [1, 0], [0, -1], [-1, 0]]

        for r in range(rows):
            for c in range(cols):
                if grid[r][c] == 2:
                    q.append([r, c])
                elif grid[r][c] == 1:
                    FOC += 1
        
        while q and FOC > 0:
            sizeQ = len(q)
            for i in range(sizeQ):
                r, c = q.popleft()
                for dr, dc in directions:
                    nr, nc = r + dr, c + dc

                    if 0 <= nr < rows and 0 <= nc < cols and grid[nr][nc] == 1:
                        q.append([nr, nc])
                        grid[nr][nc] = 2
                        FOC -= 1
            minMin += 1
        
        return -1 if FOC != 0 else minMin

        