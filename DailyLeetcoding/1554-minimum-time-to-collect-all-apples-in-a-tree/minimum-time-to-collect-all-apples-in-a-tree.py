class Solution:
    def minTime(self, n: int, edges: List[List[int]], hasApple: List[bool]) -> int:
        adj = { i: [] for i in range(n)}

        for par, child in edges:
            adj[par].append(child)
            adj[child].append(par)

        def dfs(cur, par):
            time = 0

            for child in adj[cur]:
                if child == par:
                    continue
                
                childTime = dfs(child, cur)
                if childTime or hasApple[child]:
                    time += 2 + childTime
            
            return time
        
        return dfs(0, -1)