class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        if len(matrix) == 1:
            return

        for i in range(len(matrix)):
            for j in range(i, len(matrix)):
                temp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = temp
        
        print(matrix)

        for i in range(len(matrix)):
            for j in range(len(matrix) // 2):
                temp = matrix[i][j]
                matrix[i][j] = matrix[i][-(j + 1)]
                matrix[i][-(j + 1)] = temp
        
        print("final matrix: ", matrix)

        