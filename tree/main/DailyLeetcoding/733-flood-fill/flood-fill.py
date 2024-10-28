class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:

        # creating the same copy of the image to avoid any data alteration in image itself

        newImage = [[] for i in range(len(image))]
        for i in range(len(image)):
            for j in range(len(image[0])):
                newImage[i].append(image[i][j])
        
        # initial configuration for dfs
        initialColor = image[sr][sc]
        visited = set()
        directions = [[-1, 0], [1, 0], [0, -1], [0, 1]] # up, down, left, right

        def dfs(r, c):
            for dR, dC in directions:
                nR, nC = dR + r, dC + c
                
                if 0 <= nR < len(image) and 0 <= nC < len(image[0]) and image[nR][nC] == initialColor and (nR, nC) not in visited:
                    newImage[nR][nC] = color
                    visited.add((nR, nC))
                    dfs(nR, nC)

        
        newImage[sr][sc] = color
        visited.add((sr, sc))
        dfs(sr, sc)

        return newImage
        
        