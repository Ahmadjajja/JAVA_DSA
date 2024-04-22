class Solution:
    def findTargetSumWays(self, nums: List[int], target: int) -> int:
        memo = {} #memoizing the result to reduce recursive calls
        def rec (index, exp_result):
            # base case
            if index == len(nums):

                if exp_result == target:
                    return 1

                return 0

            if (index , exp_result) in memo:
                return memo[(index, exp_result)]

            result = rec(index + 1, exp_result + nums[index]) + rec(index + 1, exp_result - nums[index])
            memo[(index, exp_result)] = result

            return result

        return rec(0, 0)