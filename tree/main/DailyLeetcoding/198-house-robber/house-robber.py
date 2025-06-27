class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums) == 1 or len(nums) == 2:
            return max(nums)

        memo = {}

        def DFS(index):
            if index >= len(nums):
                return 0
            
            if index in memo:
                return memo[index]
            
            left = DFS(index + 2)
            right = DFS(index + 3)

            ans = max(left, right) + nums[index]
            memo[index] = ans

            return ans



        
        return max(DFS(0), DFS(1))
        