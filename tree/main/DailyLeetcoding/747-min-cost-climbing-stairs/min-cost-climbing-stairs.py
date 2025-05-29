class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        memo = {}
        n = len(cost) - 1

        def DFS(index):

            if index == n:
                return cost[index]
            
            if index > n:
                return 0
            
            if index in memo:
                return memo[index]
            
            leftAns = DFS(index + 1)

            rightAns = DFS(index + 2)

            memo[index] = cost[index] + min(leftAns, rightAns)

            return memo[index]

        return min(DFS(0), DFS(1))



