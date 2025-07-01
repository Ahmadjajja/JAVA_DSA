class Solution:
    def jump(self, nums: List[int]) -> int:
        memo = {}

        def DFS(index):

            if index >= len(nums):
                return float("inf")
            
            if index == len(nums) - 1:
                return 0
            
            if index in memo:
                return memo[index]

            minSteps = float("inf")

            for j in range(1, nums[index] + 1):
                minSteps = min(DFS(index + j), minSteps)
            
            memo[index] = minSteps + 1

            return minSteps + 1


        return DFS(0)
        