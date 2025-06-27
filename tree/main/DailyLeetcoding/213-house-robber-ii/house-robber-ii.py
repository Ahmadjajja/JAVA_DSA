from typing import List

class Solution:
    def rob(self, numbers: List[int]) -> int:
        length = len(numbers)
        if length == 1 or length == 2 or length == 3:
                return max(numbers)

        def helper(nums):

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

        return max(helper(numbers[:length - 1]), helper(numbers[1:]))

