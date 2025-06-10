class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        ans = {}
        for s in strs:
            tempHM = {}
            for ch in s:
                if ch in tempHM:
                    tempHM[ch] += 1
                else:
                    tempHM[ch] = 1

            key = tuple(sorted(tempHM.items()))
            if key in ans:
                ans[key].append(s)
            else:
                ans[key] = [s]
        

        return list(ans.values())

# TC = O(N) * k log(k)
# SC = O(N) * O(k)




        