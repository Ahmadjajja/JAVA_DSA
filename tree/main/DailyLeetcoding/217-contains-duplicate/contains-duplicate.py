class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        # 1. TC: O(n), SC: O(n)

        uniqueNums = set()
        for num in nums:
            if num in uniqueNums:
                return True
            
            uniqueNums.add(num)
        
        return False

        # 2. 

        if len(nums) == 1:
            return False

        Arrays.sort()

        for i in range(1, len(nums)):
            if nums[i - 1] == nums[i]:
                return True
        
        return False
        