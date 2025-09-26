class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        hm1 = {}
        hm2 = {}

        for ch in s:
            hm1[ch] = hm1.get(ch, 0) + 1
        
        for ch in t:
            hm2[ch] = hm2.get(ch, 0) + 1

        return hm1 == hm2
        
        