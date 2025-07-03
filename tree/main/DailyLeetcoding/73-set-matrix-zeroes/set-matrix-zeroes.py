class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        zerosIndices = []
        rows = len(matrix)
        cols = len(matrix[0])


        for row in range(rows):
            for col in range(cols):
                if matrix[row][col] == 0:
                    zerosIndices.append([row, col])
                    n = [row, col]

        for n in zerosIndices:
            # make row to zeros...
            for row in range(rows):
                if row != n[0] and matrix[row][n[1]] != 0:
                    matrix[row][n[1]] = 0
            # make col to zeros...
            for col in range(cols):
                if col != n[1]and matrix[n[0]][col] != 0:
                    matrix[n[0]][col] = 0


        