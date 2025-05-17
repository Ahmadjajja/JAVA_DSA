class Solution:
    def search(self, nums: List[int], target: int) -> int:
        # # linear search

        # for i in range(len(nums)):
        #     if nums[i] == target:
        #         return i
        
        # return -1
        
        # binary search

        left, right = 0, len(nums) - 1

        while left <= right:
            mid = (left + right) // 2

            if nums[mid] == target:
                return mid
            elif target < nums[mid]:
                right = mid - 1
            else:
                left = mid + 1

        return -1