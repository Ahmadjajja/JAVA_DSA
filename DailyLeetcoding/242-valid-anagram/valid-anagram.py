class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        def countFrequency(word):
            f = {} # hashmap
            for ch in word:
                if ch in f:
                    f[ch] += 1
                else: 
                    f[ch] = 1
            return f

        return countFrequency(s) == countFrequency(t)

        # TC: O(n)
        # SC: O(n)
        