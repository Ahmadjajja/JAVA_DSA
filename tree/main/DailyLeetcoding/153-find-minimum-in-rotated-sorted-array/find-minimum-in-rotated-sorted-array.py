class Solution:
    def findMin(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]

        l, r = 0, len(nums) - 1

        while l < r:

            mid = (l + r) // 2

            if nums[l] < nums[r]:
                return nums[l]
            if mid == l or mid == r:
                return min(nums[l], nums[r])

            if nums[l] < nums[mid]:
                l = mid + 1
            else:
                r = mid
        
        return nums[l]
        