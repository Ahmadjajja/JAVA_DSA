# class Solution:
#     def characterReplacement(self, s: str, k: int) -> int:
#         count = {}
#         res = 0

#         l = 0
#         maxf = 0
#         for r in range(len(s)):
#             count[s[r]] = 1 + count.get(s[r], 0)
#             # maxf = max(maxf, count[s[r]])

#             while (r - l + 1) - max(count.values()) > k:
#                 count[s[l]] -= 1
#                 l += 1
            
#             res = max(res, r - l + 1)
        
#         return res






class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        ans = 0
        countF = {}
        l = 0
        maxC = 0
        for r in range(len(s)):
            ch = s[r]
            countF[ch] = 1 + countF.get(ch, 0)

            maxC = max(countF.values())

            
            while (r - l + 1) - maxC > k:
                countF[s[l]] -= 1
                l += 1
                maxC = max(countF.values())
            
            ans = max(ans, r - l + 1)
            
        return ans


















