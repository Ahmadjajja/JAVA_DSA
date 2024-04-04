class Solution:
    def search(self, nums: List[int], target: int) -> int:

        def binSearch(nums, target, start, end):

            if start <= end:
                middle = (start + end) // 2

                if nums[middle] == target:
                    print(middle)
                    return middle
                elif nums[middle] < target:
                    return binSearch(nums, target, middle + 1, end)
                else: 
                    return binSearch(nums, target, start, middle - 1)
            else:
                return -1

        return binSearch(nums, target, 0, len(nums) - 1)