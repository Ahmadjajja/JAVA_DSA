class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        ans = []
        row, col = 0, 0
        right, bottom, left, top = True, False, False, False


        while right or bottom or left or top:

            # right
            if right:
                # keep increasing the col untill the wall
                while col < len(matrix[0]) and matrix[row][col] != 101:
                    ans.append(matrix[row][col])
                    matrix[row][col] = 101
                    col += 1
                col -= 1

                if len(matrix) != 1:
                    row += 1

                right = False
                if matrix[row][col] != 101:
                    bottom = True




            # bottom
            if bottom:
                # keep increasing the row untill the wall
                while row < len(matrix) and matrix[row][col] != 101:
                    ans.append(matrix[row][col])
                    matrix[row][col] = 101
                    row += 1
                
                row -= 1
                if len(matrix[0]) != 1:
                    col -= 1
                bottom = False
                if matrix[row][col] != 101:
                    left = True


            # left
            if left:
                # keep decreasing the col untill the wall
                while col > -1 and matrix[row][col] != 101:
                    ans.append(matrix[row][col])
                    matrix[row][col] = 101
                    col -= 1
                
                col += 1
                if len(matrix) != 1:
                    row -= 1
                left = False
                if matrix[row][col] != 101:
                    top = True


            # top
            if top:
                # keep decreasing the row untill the wall
                while row > -1 and matrix[row][col] != 101:
                    ans.append(matrix[row][col])
                    matrix[row][col] = 101
                    row -= 1
                
                row += 1
                if len(matrix[0]) != 1:
                    col += 1
                top = False
                if matrix[row][col] != 101:
                    right = True
        
        return ans
        




        