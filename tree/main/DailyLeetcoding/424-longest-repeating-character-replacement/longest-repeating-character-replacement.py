from collections import Counter
class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        i, j = 0, 0
        ans = 0
        fc = [0 for i in range(26)]
        fc[ord(s[0]) - ord('A')] += 1

        while j < len(s):
            twl = j - i + 1 

            maxFreqElement = max(fc)
            
            if twl - maxFreqElement <= k:
                j += 1
                ans = max(ans, twl)
                if j == len(s):
                    break
                fc[ord(s[j]) - ord('A')] += 1

            else:
                fc[ord(s[i]) - ord('A')] -= 1
                i += 1
        
        return ans
        