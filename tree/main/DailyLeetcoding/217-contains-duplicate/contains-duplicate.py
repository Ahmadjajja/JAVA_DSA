class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        # 1. empty list
        # 2. for loop
        # 3. 
        
        hashmap = set()

        for n in nums:
            if n in hashmap:
                return True
            hashmap.add(n)
        
        return False