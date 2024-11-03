class Solution:
    def findOrder(self, numCourses: int, prerequisites: List[List[int]]) -> List[int]:
        adj = [[] for i in range(numCourses)]
        for u, v in prerequisites:
            adj[v].append(u)
        
        # code here
        q = collections.deque()
        inDegree = [0 for _ in range(len(adj))]
        
        # No of incoming edges to a node
        for i in range(numCourses):
            for nei in adj[i]:
                inDegree[nei] += 1
                
        # Insert all nodes with indegree 0 in q
        for i in range(numCourses):
            if inDegree[i] == 0:
                q.append(i)

        topo = []
        # Take them out of the q & just reduce the degree by 1 of adjacent node
        while q:
            node = q.popleft()
            topo.append(node)
            
            for nei in adj[node]:
                inDegree[nei] -= 1
                
                if inDegree[nei] == 0:
                    q.append(nei)
        
        
        return topo if len(topo) == numCourses else []