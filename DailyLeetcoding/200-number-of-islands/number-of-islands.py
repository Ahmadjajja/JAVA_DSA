class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        # If the grid is empty, return 0 (no islands).
        if not grid:
            return 0
        
        # Get the number of rows and columns in the grid.
        rows, cols = len(grid), len(grid[0])
        
        # Set to track visited cells.
        visit = set()
        
        # Variable to count the number of islands.
        islands = 0

        # BFS function to explore the connected land cells.
        def bfs(r, c):
            # Initialize queue and add the starting cell to the visited set.
            q = collections.deque()
            visit.add((r, c))
            q.append((r, c))

            # Explore neighbors using BFS.
            while q:
                row, col = q.popleft()
                # Directions: down, up, right, left.
                directions = [[1, 0], [-1, 0], [0, 1], [0, -1]]

                # Check all 4 possible directions.
                for dr, dc in directions:
                    nr, nc = row + dr, col + dc
                    # If the neighbor is within bounds, is land, and hasn't been visited, add to queue.
                    if (nr in range(rows) and 
                        nc in range(cols) and
                        grid[nr][nc] == "1" and
                        (nr, nc) not in visit):
                        q.append((nr, nc))
                        visit.add((nr, nc))
                        
        # Iterate through all cells in the grid.
        for r in range(rows):
            for c in range(cols):
                # If the cell is land and not visited, start a BFS to explore the island.
                if grid[r][c] == "1" and (r, c) not in visit:
                    bfs(r, c)
                    # Increment the island count after BFS completes.
                    islands += 1

        # Return the total number of islands found.
        return islands
