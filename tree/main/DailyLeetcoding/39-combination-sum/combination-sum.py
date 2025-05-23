class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []
        comb = []

        def DFS(i, sum):

            if sum > target:
                return 
            if sum == target:
                res.append(comb.copy())
                return

            for index in range(i, len(candidates)):
                comb.append(candidates[index])
                DFS(index, sum + candidates[index])
                comb.pop()
        DFS(0, 0)
            
        return res
        