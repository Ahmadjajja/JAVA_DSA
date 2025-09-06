class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        # adjacensy list
        preMap = { i:[] for i in range(numCourses)}
        for crs, pre in prerequisites:
            preMap[crs].append(pre)
        
        visitPath = set()

        def dfs(crs):
            if crs in visitPath:
                return False
            if preMap[crs] == []:
                return True
            
            visitPath.add(crs)
            for nei in preMap[crs]:
                if not dfs(nei):
                    return False
            
            visitPath.remove(crs)
            preMap[crs] = []

            return True

        for i in range(numCourses):
            if not dfs(i):
                return False

        return True
        