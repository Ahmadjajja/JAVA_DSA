class Solution:
    def rob(self, nums: List[int]) -> int:
        nums.append(0)
        nums.append(0)

        [2,7,9,3,1],0,0

        for i in range(len(nums) - 4, -1, -1):
            nums[i] += max(nums[i + 2], nums[i + 3])
        
        return max(nums[0], nums[1])
        