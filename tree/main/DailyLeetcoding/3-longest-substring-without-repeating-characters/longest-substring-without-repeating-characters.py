class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        i, j = 0, 0
        seen = set()
        max_len = 0
        
        while j < len(s):
            if s[j] not in seen:
                seen.add(s[j])
                j += 1
                max_len = max(max_len, j - i)
            else:
                seen.remove(s[i])
                i += 1

        return max_len
