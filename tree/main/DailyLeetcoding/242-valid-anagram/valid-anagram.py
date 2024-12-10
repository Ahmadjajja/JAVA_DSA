class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s_hashmap = {}
        t_hashmap = {}

        for ch in s:
            if ch in s_hashmap:
                s_hashmap[ch] += 1 # just incrementing the value if this propertly already found in dict.
            else:
                s_hashmap[ch] = 1 # adding this property first time in dictionary
        for ch in t:
            if ch in t_hashmap:
                t_hashmap[ch] += 1 # just incrementing the value if this propertly already found in dict.
            else:
                t_hashmap[ch] = 1 # adding this property first time in dictionary
        return s_hashmap == t_hashmap