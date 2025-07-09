class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1 for i in range(len(nums))]

        suffix = 1

        for i in range(len(nums) - 1, -1, -1):
            res[i] = suffix
            suffix *= nums[i]

        prefix = 1

        for i in range(len(nums)):
            res[i] *= prefix
            prefix *= nums[i]
        
        return res

        