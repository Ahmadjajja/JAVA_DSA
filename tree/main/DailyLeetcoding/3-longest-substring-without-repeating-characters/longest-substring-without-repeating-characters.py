class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        count = 0
        maxCount = 0
        uniqueChs = set()

        left, right = 0, 0

        while right < len(s):
            if s[right] not in uniqueChs:
                uniqueChs.add(s[right])
                count += 1
                maxCount = max(maxCount, count)
                right += 1
                continue
            while s[right] in uniqueChs:
                uniqueChs.remove(s[left])
                left += 1
                count -= 1
            uniqueChs.add(s[right])
            count += 1
            right +=1
        
        return maxCount
        