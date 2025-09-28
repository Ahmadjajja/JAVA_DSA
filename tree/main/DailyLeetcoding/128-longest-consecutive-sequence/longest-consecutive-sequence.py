class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        setNums = set(nums)
        longest = 0

        for n in setNums:
            # check if it's the start of the sequence
            if (n - 1) not in setNums:
                length = 0
                while (n + length) in setNums:
                    length += 1
                longest = max(longest, length)
            
        return longest

            

        