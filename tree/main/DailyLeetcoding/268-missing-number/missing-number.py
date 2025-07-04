class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        ans = 0
        for i in range(len(nums) + 1):
            ans ^= i
        
        for n in nums:
            ans ^= n

        return ans
        