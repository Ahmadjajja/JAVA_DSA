from typing import List

class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]
        if len(nums) == 2:
            return max(nums)
        
        def rob_linear(arr: List[int]) -> int:
            arr = arr[:]  # make a copy to avoid modifying original
            arr.extend([0, 0])
            for i in range(len(arr) - 3, -1, -1):
                arr[i] = max(arr[i] + arr[i+2], arr[i+1])
            return arr[0]
        
        return max(rob_linear(nums[:-1]), rob_linear(nums[1:]))
