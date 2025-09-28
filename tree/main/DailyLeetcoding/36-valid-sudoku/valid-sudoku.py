class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        # rows
        for i in range(9):
            seen = set()
            for c in range(9):
                v = board[i][c]
                if v == '.': continue
                if v in seen: return False
                seen.add(v)

        # cols
        for j in range(9):
            seen = set()
            for r in range(9):
                v = board[r][j]
                if v == '.': continue
                if v in seen: return False
                seen.add(v)

        # 3x3 boxes
        for br in range(0, 9, 3):
            for bc in range(0, 9, 3):
                seen = set()
                for r in range(br, br + 3):
                    for c in range(bc, bc + 3):
                        v = board[r][c]
                        if v == '.': continue
                        if v in seen: return False
                        seen.add(v)
        return True
