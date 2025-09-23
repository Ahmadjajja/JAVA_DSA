class Solution:
    def rob(self, nums: List[int]) -> int:

        memo = {}
        def dfs(node):
            # base case
            if node > len(nums):
                return 0
            
            if (node, nums[node]) in memo:
                return memo[(node, nums[node])]

            prevMaxVal = 0
            for i in range(node + 2, len(nums)):
                prevMaxVal = max(dfs(i), prevMaxVal)
            
            memo[(node, nums[node])] = prevMaxVal + nums[node]

            return prevMaxVal + nums[node]
            
        ans = 0
        for i in range(len(nums)):
            ans = max(ans, dfs(i))
        
        return ans
        

        