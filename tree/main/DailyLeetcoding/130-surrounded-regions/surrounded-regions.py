class Solution:
    def solve(self, board: List[List[str]]) -> None:
        ROWS, COLS = len(board), len(board[0])

        def capture(r, c):
            if (r < 0 or c < 0 or r == ROWS or
                c == COLS or board[r][c] != "O"
            ):
                return
            board[r][c] = "T"
            
            dirArr = [(0, 1), (1, 0), (0, -1), (-1, 0)]
            for dr, dc in dirArr:
                capture(r + dr, c + dc)

        for r in range(ROWS):
            for c in range(COLS):
                if board[r][c] == "O" and ( r in [0, ROWS - 1] or c in [0, COLS - 1] ):
                    capture(r, c)

        for c in range(COLS):
            if board[0][c] == "O":
                capture(0, c)
            if board[ROWS - 1][c] == "O":
                capture(ROWS - 1, c)

        for r in range(ROWS):
            for c in range(COLS):
                if board[r][c] == "O":
                    board[r][c] = "X"
                elif board[r][c] == "T":
                    board[r][c] = "O"


# 1. adjcensy list
# 2. directions array [(0, 1), (1, 0), (0, -1), (-1, 0)]