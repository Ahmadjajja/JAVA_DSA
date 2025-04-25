class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        # dynamic programming solution
        cost.append(0)

        for i in range(len(cost) - 3, -1, -1):
            cost[i] += min(cost[i + 1], cost[i + 2])
        
        return min(cost[0], cost[1])

        # # let's create a cache to store repeated recursion calls
        # cache = [-1] * (len(cost) + 1)

        # def helper(index):

        #     if index >= len(cost):
        #         return 0
            
        #     if cache[index] != -1:
        #         return cache[index]

        #     cache[index] = cost[index] + min(helper(index + 1), helper(index + 2))

        #     return cache[index]

        # return min(helper(0), helper(1))



