class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        # 1. TC: O(n), SC: O(n)
        
        uniqueNums = set()
        for num in nums:
            if num in uniqueNums:
                return True
            
            uniqueNums.add(num)
        
        return False
        