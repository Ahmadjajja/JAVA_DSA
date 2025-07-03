class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        q = []


        for row in range(len(matrix)):
            for col in range(len(matrix[0])):
                if matrix[row][col] == 0:
                    q.append([row, col])

        for n in q:
            # make row to zeros...
            for row in range(len(matrix)):
                if row != n[0]:
                    matrix[row][n[1]] = 0
            # make row to zeros...
            for col in range(len(matrix[0])):
                if col != n[1]:
                    matrix[n[0]][col] = 0

            # make col to zeros...

        