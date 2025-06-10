class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:


        # for i in range(len(nums)):
        #     for j in range(i + 1, len(nums)):
        #         if nums[i] + nums[j] == target:
        #             return [i, j]

        # 1. create a hashmap and store value
        hashmap = {}
        # for i in range(len(nums)):
        #     hashmap[nums[i]] = i

        for i, n in enumerate(nums):
            if (target - n) in hashmap:
                return [hashmap[target - n], i]
            
            hashmap[n] = i


        # 2. 
        # 3.

# 10^4 * 10^4
        
# TC = O(n^2)
# SC = O(1)


# O(nlogn)



