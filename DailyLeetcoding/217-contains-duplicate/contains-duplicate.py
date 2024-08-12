class Solution:
    # # Brute-Force Approach
    # def containsDuplicate(self, nums: List[int]) -> bool:
    #     for i in range(len(nums)):
    #         for j in range(i + 1, len(nums)):
    #             if nums[i] == nums[j]:
    #                 return True


    # T: O(n2)
    # S: O(1)

    # Efficient Approach

    def containsDuplicate(self, nums: List[int]) -> bool:
        hashset = set()

        for n in nums:
            if n in hashset:
                return True
            hashset.add(n)
        
        return False

    # T: O(n)
    # S: O(1)