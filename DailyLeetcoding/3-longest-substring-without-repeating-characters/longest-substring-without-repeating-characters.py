class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        longestSubstring = 0
        l, r = 0, 0
        while l < len(s):
            hashset = set()
            while r < len(s) and not (s[r] in hashset):
                hashset.add(s[r])
                r += 1
            longestSubstring = max(longestSubstring, len(hashset))
            l += 1
            r = l
        
        return longestSubstring
