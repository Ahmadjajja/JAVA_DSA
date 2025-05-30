class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        row = [1]  * n

        upperRow = [1] * (n)

        for index in range(m - 1):
            for i in range(n - 2, -1, -1):
                upperRow[i] = upperRow[i + 1] + row[i]
            row = upperRow.copy()
        
        return upperRow[0]

        