class Solution:
    def numEnclaves(self, grid: List[List[int]]) -> int:
        rows, cols = len(grid), len(grid[0])
        q = collections.deque()
        visited = set()
        directions = [[-1, 0], [1, 0], [0, -1], [0, 1]] # up, down, left, right
        enclave = 0

        # finding border land cell from where we can walk off the boundary of the grid
        for r in range(rows):
            if grid[r][0] == 1:
                q.append((r, 0))
                visited.add((r, 0))
            if grid[r][cols - 1]:
                q.append((r, cols - 1))
                visited.add((r, cols - 1))

        for c in range(cols):
            if grid[0][c] == 1:
                q.append((0, c))
                visited.add((0, c))
            if grid[rows - 1][c]:
                q.append((rows - 1, c))
                visited.add((rows - 1, c))
        # BFS
        while q:
            row, col = q.popleft()

            for delR, delC in directions:
                nr, nc = delR + row, delC + col

                if 0 <= nr < rows and 0 <= nc < cols and (nr, nc) not in visited and grid[nr][nc] == 1:
                    q.append((nr, nc))
                    visited.add((nr, nc))
        
        for i in range(rows):
            for j in range(cols):
                if (i, j) not in visited and grid[i][j] == 1:
                    enclave += 1
        
        return enclave
