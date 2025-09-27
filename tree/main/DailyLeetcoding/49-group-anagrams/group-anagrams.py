class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        groupAnagrams = {}

        for s in strs:
            uniqueChArrCount = [0] * 26
            for ch in s:
                uniqueChArrCount[ord(ch) - ord('a')] += 1
            tupKey = tuple(uniqueChArrCount)
            if tupKey in groupAnagrams:
                groupAnagrams[tupKey].append(s)
            else:
                groupAnagrams[tupKey] = [s]
        
        return list(groupAnagrams.values())
        