class Solution:
    def eventualSafeNodes(self, graph: List[List[int]]) -> List[int]:
        visited = set()
        pathVisited = set()

        def DFS(node):
            visited.add(node)
            pathVisited.add(node)

            for nei in graph[node]:
                if nei not in visited:
                    if DFS(nei):
                        return True
                elif nei in pathVisited:
                    return True
            # back-track
            pathVisited.discard(node)
            return False

        for node in range(len(graph)):
            if node not in visited:
                DFS(node)
        ans = []
        for node in range(len(graph)):
            if node not in pathVisited:
                ans.append(node)
        return ans
        