class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rows = [set() for _ in range(9)]
        cols = [set() for _ in range(9)]
        boxes = [set() for _ in range(9)]  # box id = (r//3)*3 + (c//3)

        for r in range(9):
            for c in range(9):
                val = board[r][c]
                if val == '.':
                    continue
                b = (r // 3) * 3 + (c // 3)
                if val in rows[r] or val in cols[c] or val in boxes[b]:
                    return False
                rows[r].add(val)
                cols[c].add(val)
                boxes[b].add(val)
        return True


# class Solution:
#     def isValidSudoku(self, board: List[List[str]]) -> bool:
#         # rows
#         for i in range(9):
#             seen = set()
#             for c in range(9):
#                 v = board[i][c]
#                 if v == '.': continue
#                 if v in seen: return False
#                 seen.add(v)

#         # cols
#         for j in range(9):
#             seen = set()
#             for r in range(9):
#                 v = board[r][j]
#                 if v == '.': continue
#                 if v in seen: return False
#                 seen.add(v)

#         # 3x3 boxes
#         for br in range(0, 9, 3):
#             for bc in range(0, 9, 3):
#                 seen = set()
#                 for r in range(br, br + 3):
#                     for c in range(bc, bc + 3):
#                         v = board[r][c]
#                         if v == '.': continue
#                         if v in seen: return False
#                         seen.add(v)
#         return True