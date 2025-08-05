class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        # check rule 1: check this row
        for r in range(9):
            rowCheck = set()
            for c in range(9):
                if board[r][c] != ".":
                    if board[r][c] in rowCheck:
                        return False
                    rowCheck.add(board[r][c])
        
        # check rule 2: check this row
        for c in range(9):
            colCheck = set()
            for r in range(9):
                if board[r][c] != ".":
                    if board[r][c] in colCheck:
                        return False
                    colCheck.add(board[r][c])
        

        # rule 3: check subbox
        arr = [
            (0, 0), (0, 3), (0, 6),
            (3, 0), (3, 3), (3, 6),
            (6, 0), (6, 3), (6, 6),
        ]
        for indices in arr:
            row, col = indices
            subBoxCheck = set()
            for r in range(row, row + 3):
                for c in range(col, col + 3):
                    if board[r][c] != ".":
                        if board[r][c] in subBoxCheck:
                            return False
                        subBoxCheck.add(board[r][c])
        return True


        


        