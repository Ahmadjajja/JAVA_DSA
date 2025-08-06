class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:

        seenAll = set(nums)
        seenInd = set()
        LogConsecElem = 0
        consecElem = 0
        for n in nums:

            if not (n in seenInd):
                seenInd.add(n)
                consecElem += 1

                temp = n
                # checking on the left side
                while (temp - 1) in seenAll:
                    seenInd.add(temp - 1)
                    consecElem += 1
                    temp -= 1
                
                temp = n
                # checking on the right side
                while (temp + 1) in seenAll:
                    seenInd.add(temp + 1)
                    consecElem += 1
                    temp += 1
                
                LogConsecElem = max(consecElem, LogConsecElem)
                consecElem = 0
        
        return LogConsecElem
            





