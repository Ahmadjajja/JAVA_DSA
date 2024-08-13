# class Solution:
#     def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
#         res = defaultdict(list) # mapping charCount to list of anagrams

#         for s in strs:
#             count = [0] * 26 # a ... z

#             for c in s:
#                 count[ord(c) - ord("a")] =+ 1
            
#             res[tuple(count)].append(s) # list can't be key, that's why converted into tuple
        
#         return res.values()

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ans = collections.defaultdict(list)

        for s in strs:
            count = [0] * 26
            for c in s:
                count[ord(c) - ord("a")] += 1
            ans[tuple(count)].append(s)
        return ans.values()
