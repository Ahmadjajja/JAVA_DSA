class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # # 1. TC: O(n), SC: O(n)
        # hm1 = {}
        # hm2 = {}

        # for ch in s:
        #     hm1[ch] = hm1.get(ch, 0) + 1
        
        # for ch in t:
        #     hm2[ch] = hm2.get(ch, 0) + 1

        # return hm1 == hm2

        # 2. TC: O(nlogn), SC: O(1)
        # s = "".join(sorted(s))
        # t = "".join(sorted(t))

        # if len(s) != len(t):
        #     return False
        
        # for i in range(len(s)):
        #     if s[i] != t[i]:
        #         return False
        
        # return True


        # 2. TC: O(n), SC: O(1)
        if len(s) != len(t):
            return False
        
        counts = [0] * 26

        for a,b in zip(s, t):
            counts[ord(a) - ord('a')] += 1
            counts[ord(b) - ord('a')] -= 1
        
        return all(c == 0 for c in counts)
        
        