class Solution:
    def rob(self, nums: List[int]) -> int:
        def helper(houses):
            rob1, rob2 = 0, 0

            # [rob1, rob2, n, n + 1, ...]
            for n in houses:
                temp = max(rob1 + n, rob2)
                rob1 = rob2
                rob2 = temp

            return rob2

        return max(nums[0], helper(nums[1:]), helper(nums[:-1]))
        