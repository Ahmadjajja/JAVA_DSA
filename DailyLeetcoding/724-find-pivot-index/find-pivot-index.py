class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        sum = 0
        for number in nums:
            sum += number
        
        leftSum = 0

        for i in range(len(nums)):
            sum = sum - nums[i]

            if(i > 0):
                leftSum += nums[i - 1]
            
            if sum == leftSum:
                return i
            
        return -1

        