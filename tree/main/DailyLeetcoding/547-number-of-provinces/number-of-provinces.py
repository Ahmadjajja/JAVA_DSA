class Solution:
    def findCircleNum(self, isConnected):
        # convert the matrix to an adjacency list
        n = len(isConnected)
        adj_list = {i: [] for i in range(n)}
        for i in range(n):
            for j in range(n):
                if isConnected[i][j] == 1 and i != j:
                    adj_list[i].append(j)
                    adj_list[j].append(i) # in case if un-directed graph

        # initial configuration for dfs
        visited = set()
        province_count = 0

        # dfs
        def dfs(node):
            visited.add(node)

            for neighbor in adj_list[node]:
                if neighbor not in visited: 
                    dfs(neighbor)

        # traverse through cities and start dfs if un-visited
        for i in range(n):
            if i not in visited:
                dfs(i)
                province_count += 1
        
        return province_count


