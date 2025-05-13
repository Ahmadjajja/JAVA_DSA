class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        hashmap1 = {}
        hashmap2 = {}
        
        for ch in s:
            if ch in hashmap1:
                hashmap1[ch] += 1
            else:
                hashmap1[ch] = 1

        for ch in t:
            if ch in hashmap2:
                hashmap2[ch] += 1
            else:
                hashmap2[ch] = 1
        
        return hashmap1 == hashmap2

