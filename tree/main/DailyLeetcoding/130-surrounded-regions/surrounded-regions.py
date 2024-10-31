from typing import List

class Solution:
    def solve(self, board: List[List[str]]) -> None:
        if not board:
            return

        rows, cols = len(board), len(board[0])
        visited = set()
        directions = [[-1, 0], [1, 0], [0, -1], [0, 1]]

        def dfs(r, c):
            visited.add((r, c))
            for delR, delC in directions:
                nr, nc = r + delR, c + delC
                if 0 <= nr < rows and 0 <= nc < cols and (nr, nc) not in visited and board[nr][nc] == "O":
                    dfs(nr, nc)

        # Run DFS from the "O"s on the borders
        for i in range(rows):
            if board[i][0] == "O":
                dfs(i, 0)
            if board[i][cols - 1] == "O":
                dfs(i, cols - 1)

        for j in range(cols):
            if board[0][j] == "O":
                dfs(0, j)
            if board[rows - 1][j] == "O":
                dfs(rows - 1, j)

        # Flip all unvisited "O"s to "X"s
        for i in range(rows):
            for j in range(cols):
                if (i, j) not in visited and board[i][j] == "O":
                    board[i][j] = "X"
