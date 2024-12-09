class Solution:

    def containsDuplicate(self, nums: List[int]) -> bool:
        # optimize approach
        hashSet = set()

        for num in nums:
            if num in hashSet:
                return True
            else:
                hashSet.add(num)
        return False




        # # brute-force approach
        # for i in range(0, len(nums)):
        #     for j in range(0, len(nums)):
        #         if i != j and nums[i] == nums[j]:
        #             return True
        # return False






# # constraint-1
# minimum length of list can be 1.
# maximum length of list can be 100000
# 1 <= length of list <= 100000

# #constraint-2
# minimum size of an element of list can be -1000000000
# maximum size of an element of list can be 1000000000