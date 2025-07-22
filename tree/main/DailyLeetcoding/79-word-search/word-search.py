# class Solution:
#     def exist(self, board: List[List[str]], word: str) -> bool:
#         rows, cols = len(board), len(board[0])
#         check = [[False for _ in range(cols)] for _ in range(rows)] 

#         def wordSearch(row, col, wordLen, w):
#             # base case
#             if wordLen == len(word):
#                 return True

#             # top
#             top = False
#             if row - 1 > -1:
#                 if not check[row - 1][col] and w + board[row - 1][col] == word[:wordLen + 1]:
#                     check[row - 1][col] = True
#                     top = wordSearch(row - 1, col, wordLen + 1, word[:wordLen + 1])
#                     check[row - 1][col] = False
#             # right
#             right = False
#             if col + 1 < cols:
#                 if not check[row][col + 1] and w + board[row][col + 1] == word[:wordLen + 1]:
#                     check[row][col + 1] = True
#                     right = wordSearch(row, col + 1, wordLen + 1, word[:wordLen + 1])
#                     check[row][col + 1] = False

#             # bottom
#             bottom = False
#             if row + 1 < rows:
#                 if not check[row + 1][col] and w + board[row + 1][col] == word[:wordLen + 1]:
#                     check[row + 1][col] = True
#                     bottom = wordSearch(row + 1, col, wordLen + 1, word[:wordLen + 1])
#                     check[row + 1][col] = False

#             # left
#             left = False
#             if not check[row][col - 1] and col - 1 > -1:
#                 if w + board[row][col - 1] == word[:wordLen + 1]:
#                     check[row][col - 1] = True
#                     left = wordSearch(row, col - 1, wordLen + 1, word[:wordLen + 1])
#                     check[row][col - 1] = False
            
#             return top or right or bottom or left


#         for r in range(rows):
#             for c in range(cols):
#                 if board[r][c] == word[0]:
#                     check[r][c] = True
#                     if wordSearch(r, c, 1, "" + word[0]):
#                         return True
#                     check[r][c] = False

#         return False

class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        rows, cols = len(board), len(board[0])
        visited = [[False for _ in range(cols)] for _ in range(rows)]
        directions = [(-1, 0), (0, 1), (1, 0), (0, -1)]  # top, right, bottom, left

        def dfs(r, c, idx):
            if idx == len(word):
                return True

            for dr, dc in directions:
                nr, nc = r + dr, c + dc
                if (
                    0 <= nr < rows and
                    0 <= nc < cols and
                    not visited[nr][nc] and
                    board[nr][nc] == word[idx]
                ):
                    visited[nr][nc] = True
                    if dfs(nr, nc, idx + 1):
                        return True
                    visited[nr][nc] = False  # backtrack

            return False

        for r in range(rows):
            for c in range(cols):
                if board[r][c] == word[0]:
                    visited[r][c] = True
                    if dfs(r, c, 1):  # start from index 1 since word[0] is already matched
                        return True
                    visited[r][c] = False  # backtrack

        return False


        