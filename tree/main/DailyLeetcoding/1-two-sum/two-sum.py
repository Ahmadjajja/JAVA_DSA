class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashmap = {}

        for i, n in enumerate(nums):
            if (target - n) in hashmap:
                return [hashmap[target - n], i]
            
            hashmap[n] = i



