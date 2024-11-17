class Solution:
    def rob(self, nums: List[int]) -> int:
        dp = [-1] * len(nums)
        maxM = 0

        def maxMoney(index):
            if index == len(nums) - 1 or index == len(nums) - 2:
                dp[index] = nums[index]
                return nums[index]

            if dp[index] != -1:
                return dp[index]

            sumM = 0
            for i in range(index + 2, len(nums)):
                sumM = max(sumM, nums[index] + maxMoney(i))

            dp[index] = sumM
            return sumM

        for i in range(len(nums)):
            maxM = max(maxM, dp[i] if dp[i] != -1 else maxMoney(i))

        return maxM